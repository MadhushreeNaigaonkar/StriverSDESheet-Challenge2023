class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>(); //2D List to store ans
        List<String> path=new ArrayList<>();

        fun(0,s,path,res);  //function call for patitioning
        return res;
    }
    //This question uses backtracking
    public void fun(int index,String s, List<String> path,List<List<String>> res){
        if(index==s.length()){  //BaseCase when index reaches to end add all the elements of path in res 
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<s.length();++i){
            if(isPalindrome(s,index,i)){    //check the partition satisfy the palindromic condition
                path.add(s.substring(index,i+1)); //add the substring to path
                fun(i+1,s,path,res);    //recursive call to fun
                path.remove(path.size()-1); //remove the unnecessary elements 

            }
        }
    }

    // code to check palindrome
    boolean isPalindrome(String s,int index,int i){
        while(index<=i){
            if(s.charAt(index++)!=s.charAt(i--)){
                return false;
            }
            
        }
        return true;
    }
}