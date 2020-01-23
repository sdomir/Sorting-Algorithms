import java.util.ArrayList;

public class QuickSort extends Sort {

    QuickSort(int[] arr) {
        unsorted = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            unsorted.add(arr[i]);
    }

    public void sortArray() {
        int start = 0;
        int end = unsorted.size()-1;
        quickSort(start,end);
    }

    public void quickSort(int start, int end) {
        if(start < end) {
            int pos = divide(start,end);
            quickSort(start,pos-1);
            quickSort(pos+1,end);
        }
    }

    public int divide(int start,int end) {
        int pos = start;
        int pivot = end;
        for(int i=start;i<end;i++) {
            if(unsorted.get(i)<unsorted.get(pivot)) {
                swap(i,pos);
                pos++;
            }
        }
        swap(pos,pivot);
        return pos;
    }

    public void swap(int i,int j) {
        int temp = unsorted.get(i);
        unsorted.set(i,unsorted.get(j));
        unsorted.set(j,temp);
    }
}
