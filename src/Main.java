public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Sorting World!");
        int[] arr = {5,9,3,6,2,1,4};
        SelectionSort sort = new SelectionSort();
        int[] result = sort.sortArray(arr);
        print(result);
    }
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
