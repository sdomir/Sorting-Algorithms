public class InsertionSort {
    public int[] sortArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int pos = i - 1;
            int key = nums[i];
            while (pos >= 0 && key < nums[pos]) {
                nums[pos + 1] = nums[pos];
                pos--;
            }
            nums[pos + 1] = key;
        }
        return nums;
    }
}
