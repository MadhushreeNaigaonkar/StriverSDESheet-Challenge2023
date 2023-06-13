import java.util.HashMap;

class LargestSubArray
{
    int maxLen(int arr[], int N)
    {
    HashMap<Integer, Integer> hM
            = new HashMap<Integer, Integer>();
 
        int sum = 0; 
        int max_len = 0; 
 
        
        for (int i = 0; i < arr.length; i++) {
            
            sum += arr[i];
 
            if (sum == 0)
                max_len = i + 1;
 
            
            Integer prev_i = hM.get(sum);
 
            
            if (prev_i != null)
                max_len = Math.max(max_len, i - prev_i);
            else 
                 hM.put(sum, i);
        }
 
        return max_len; 
     
      // Your code here
    }
}