package Day11;



class Solution{
    public void fun(int ind, ArrayList<Integer> arr, int sum, ArrayList<Integer> list){
        if(ind == arr.size()){
            list.add(sum);
            return ;
        }
        fun(ind+1, arr, sum , list);
        fun(ind+1, arr, sum+arr.get(ind), list);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> list = new ArrayList<>();
        fun(0, arr, 0, list);
        return list;
    }
}
