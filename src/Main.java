public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Sorting World!");
        int[] arr = {5,9,3,6,2,1,4};
        int[] result;
        SelectionSort selSort = new SelectionSort();
        result = selSort.sortArray(arr);
        print(result,"Selection Sort");
        InsertionSort inSort = new InsertionSort();
        result = inSort.sortArray(arr);
        print(result,"Insertion Sort");
    }
    public static void print(int[] arr, String message) {
        System.out.println(message);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
