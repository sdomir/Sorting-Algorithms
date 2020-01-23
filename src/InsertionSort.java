import java.util.ArrayList;

public class InsertionSort extends Sort {

    InsertionSort(int[] arr) {
        unsorted = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            unsorted.add(arr[i]);
    }

    public void sortArray() {
        for (int i = 1; i < unsorted.size(); i++) {
            int pos = i - 1;
            int key = unsorted.get(i);
            while (pos >= 0 && key < unsorted.get(pos)) {
                unsorted.set(pos + 1,unsorted.get(pos));
                pos--;
            }
            unsorted.set(pos + 1,key);
        }
    }
}
