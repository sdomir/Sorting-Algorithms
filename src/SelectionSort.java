import java.util.*;
public class SelectionSort {
    public void sortArray(int [] nums) {
        for(int i=0;i<nums.length-1;i++) {
            int min = i;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] < nums[min])
                        min = j;
                }
                swap(nums, i, min);
            }
        }
    public void swap(int[] arr, int i,int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
