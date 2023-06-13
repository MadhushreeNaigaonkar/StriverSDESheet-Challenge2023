import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int maxSequence = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i < nums.length; i++) {
            int currentSequence = 1;
            int current = nums[i];
            
            while (set.contains(--current)) {
                currentSequence++;
                set.remove(current);
            }

            current = nums[i];
            while (set.contains(++current)) {
                currentSequence++;
                set.remove(current);
            }

            maxSequence = Math.max(maxSequence, currentSequence);
        }

        return maxSequence;
    }
}