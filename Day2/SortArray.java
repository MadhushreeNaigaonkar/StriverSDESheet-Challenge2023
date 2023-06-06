//Q. Sort Array of 0's,1's and 2's
class Solution {
    public void sortColors(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}