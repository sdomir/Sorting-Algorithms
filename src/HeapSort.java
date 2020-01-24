import java.util.ArrayList;

public class HeapSort extends Sort {

    HeapSort(int[] arr) {
        unsorted = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            unsorted.add(arr[i]);
    }

    public void sortArray() {
        int n = unsorted.size();
        for(int i=n/2-1;i>=0;i--)
            heapify(i,n);

        for(int j=n-1;j>=0;j--) {
            int temp = unsorted.get(0);
            unsorted.set(0,unsorted.get(j));
            unsorted.set(j,temp);
            heapify(0,j);
        }
    }

    public void heapify(int root,int sizeOfHeap) {
        int l = 2*root+1;
        int r = 2*root+2;
        int largest = root;
        if(l<sizeOfHeap && unsorted.get(l)>unsorted.get(largest))
            largest = l;
        if(r<sizeOfHeap && unsorted.get(r)>unsorted.get(largest))
            largest = r;
        if(largest!=root) {
            swap(largest,root);
            heapify(largest,sizeOfHeap);
        }
    }

    public void swap(int a,int b) {
        int temp = unsorted.get(a);
        unsorted.set(a,unsorted.get(b));
        unsorted.set(b,temp);
    }
}
