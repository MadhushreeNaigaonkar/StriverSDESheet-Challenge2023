package Day10;

class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        int[] timeline = new int[2361];
        
         
        
        for(int i=0;i<n;i++){
            ++timeline[arr[i]];
        }
        
        for(int i=0;i<n;i++){
           -- timeline[dep[i]+1];
        }
        
        int ans=1;
        for(int i=1;i<2361;i++){
            timeline[i]=timeline[i]+timeline[i-1];
            ans= Math.max(ans,timeline[i]);
        }
        return ans;
        
        // add your code here
        
    }
    
}

