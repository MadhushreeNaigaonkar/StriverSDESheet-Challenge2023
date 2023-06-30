package Day14;

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-2;
        int mid=0;
        
        while(start<=end){
            mid=start+(end-start)/2;
            
            if(nums[mid]==nums[mid^1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return nums[start];
        
    }
    }
   
