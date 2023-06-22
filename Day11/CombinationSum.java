package Day11;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //Approach: Using sorting and recursion
        List<List<Integer>> ans = new ArrayList<>();

        //base case
        if(candidates==null || candidates.length==0 || target<=0){
            return ans;
        }
        
        //sort our candidate array
        Arrays.sort(candidates);

        //call helper function
        helper(candidates, target, 0, new ArrayList<>(), ans);

        return ans;


    }
    //helper function
    private void helper(int[] candidates, int target, int start, ArrayList<Integer> tempList, List<List<Integer>> ans){
        //base condition, if target become 0
        if(target==0){
            ans.add(new ArrayList<>(tempList));
            return;
        }
        //traverse 
        for(int i=start;i<candidates.length;i++){
            //if candidates of i is greater than target than break
            if(candidates[i]>target){
                break;
            }
            //add element to tempList
            tempList.add(candidates[i]);
            //call recursion
            helper(candidates, target-candidates[i], i, tempList, ans);
            //remove element from tempList
            tempList.remove(tempList.size()-1);
        }
    }
}
