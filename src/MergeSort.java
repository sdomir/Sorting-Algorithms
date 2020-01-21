import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public void sortArray(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        mergeSort(nums,start,end);
        //return nums;
    }
    public void mergeSort(int[] nums, int start, int end) {
        if(start<end) {
            int mid = (start+end)/2;
            mergeSort(nums,start,mid);
            mergeSort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
    }
    public void merge(int[] nums,int start,int mid,int end) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> brr = new ArrayList<>();
        for(int i=start;i<=mid;i++)
            arr.add(nums[i]);
        for(int j=mid+1;j<=end;j++)
            brr.add(nums[j]);

        int i=0, j=0;
        int k=start;
        while(i<arr.size() && j<brr.size()) {
            if(arr.get(i)<=brr.get(j)) {
                nums[k] = arr.get(i);
                i++;
            }
            else {
                nums[k] = brr.get(j);
                j++;
            }
            k++;
        }

        while(i<arr.size()) {
            nums[k] = arr.get(i);
            i++;
            k++;
        }

        while(j<brr.size()) {
            nums[k] = brr.get(j);
            j++;
            k++;
        }
    }
}
