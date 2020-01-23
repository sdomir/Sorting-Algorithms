import java.util.ArrayList;
import java.util.List;

public class MergeSort extends Sort{

    MergeSort(int[] arr) {
        unsorted = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            unsorted.add(arr[i]);
    }

    public void sortArray() {
        int start = 0;
        int end = unsorted.size()-1;
        mergeSort(start,end);

    }
    public void mergeSort(int start, int end) {
        if(start<end) {
            int mid = (start+end)/2;
            mergeSort(start,mid);
            mergeSort(mid+1,end);
            merge(start,mid,end);
        }
    }
    public void merge(int start,int mid,int end) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> brr = new ArrayList<>();
        for(int i=start;i<=mid;i++)
            arr.add(unsorted.get(i));
        for(int j=mid+1;j<=end;j++)
            brr.add(unsorted.get(j));

        int i=0, j=0;
        int k=start;
        while(i<arr.size() && j<brr.size()) {
            if(arr.get(i)<=brr.get(j)) {
                unsorted.set(k,arr.get(i));
                i++;
            }
            else {
                unsorted.set(k,brr.get(j));
                j++;
            }
            k++;
        }

        while(i<arr.size()) {
            unsorted.set(k,arr.get(i));
            i++;
            k++;
        }

        while(j<brr.size()) {
            unsorted.set(k,brr.get(j));
            j++;
            k++;
        }
    }
}
