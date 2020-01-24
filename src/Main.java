public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Sorting World!");
        int[] arr = {5,7,3,6,2,1,4,2};

        Sort selSort = new SelectionSort(arr);
        selSort.sortArray();
        selSort.print("Selection Sort");

        Sort inSort = new InsertionSort(arr);
        inSort.sortArray();
        inSort.print("Insertion Sort");

        Sort merSort = new MergeSort(arr);
        merSort.print("Before Merge Sort");
        merSort.sortArray();
        merSort.print("Merge Sort");

        Sort qSort = new QuickSort(arr);
        qSort.sortArray();
        qSort.print("Quick Sort");

        Sort hSort = new HeapSort(arr);
        hSort.sortArray();
        hSort.print("Heap Sort");
    }
    public static void print(int[] arr, String message) {
        System.out.println(message);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
