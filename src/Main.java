public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Sorting World!");
        int[] arr = {5,7,3,6,2,1,4};
        /*
        SelectionSort selSort = new SelectionSort();
        selSort.sortArray(arr);
        print(arr,"Selection Sort");

        InsertionSort inSort = new InsertionSort();
        inSort.sortArray(arr);
        print(arr,"Insertion Sort");
        */
        MergeSort inSort = new MergeSort();
        inSort.sortArray(arr);
        print(arr,"Merge Sort");
    }
    public static void print(int[] arr, String message) {
        System.out.println(message);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
