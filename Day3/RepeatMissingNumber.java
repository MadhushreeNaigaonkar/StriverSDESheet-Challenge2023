package Day3;

public class RepeatMissingNumber {
 public static int[] findMissingRepeatingNumbers(int[] a) {
        int n = a.length; 
        int repeating = -1, missing = -1;

        
        for (int i = 1; i <= n; i++) {
            
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] == i) cnt++;
            }

            if (cnt == 2) repeating = i;
            else if (cnt == 0) missing = i;

            if (repeating != -1 && missing != -1)
                break;
        }
        int[] ans = {repeating, missing};
        return ans;  
    } 
}
