import java.util.Arrays;

class Solution {

    public boolean isSafe(int nums[]){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                count++;
            }
            if(count==nums.length){
                return false;
            }
        }
        return true;
    }
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        if(isSafe(nums)){
        for(int i=0;i<nums.length;i++){
            
            currSum=currSum+nums[i];
            if(currSum<0){
                currSum=0;
            }

            maxSum=Math.max(maxSum,currSum);
        }
        }
        else{
            Arrays.sort(nums);
            maxSum=nums[nums.length-1];
        }



    return maxSum;
    }
}