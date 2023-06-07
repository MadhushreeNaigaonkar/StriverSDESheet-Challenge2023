package Day3;

class Solution {
    public int findDuplicate(int[] nums) {
      int len=nums.length;
      int i=0;
      while(i<len){
          int correct=nums[i]-1;
          if(nums[i]!=nums[correct]){
              int temp= nums[i];
              nums[i]=nums[correct];
              nums[correct]=temp;
          }
          else{i++;}
      }

      for(i=0;i<len;i++){
          if(i+1!=nums[i]){
              return nums[i];
          }
      }  
      return -1;
    }
}
