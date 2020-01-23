import java.util.*;
public class SelectionSort extends Sort {

    SelectionSort(int[] arr) {
        unsorted = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            unsorted.add(arr[i]);
    }

    public void sortArray() {
        for(int i=0;i < unsorted.size()-1;i++) {
            int min = i;
            for (int j = i; j < unsorted.size(); j++) {
                if(unsorted.get(j) < unsorted.get(min))
                    min = j;
            }
            swap(i, min);
        }
    }

    public void swap(int i,int j) {
        int temp = unsorted.get(i);
        unsorted.set(i,unsorted.get(j));
        unsorted.set(j,temp);
    }
}
