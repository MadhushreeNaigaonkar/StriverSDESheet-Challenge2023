package Day13;

class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        
        boolean[][] visited= new boolean[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(visited[i], false);
        }
        
        return helper(m, n , 0 ,0, visited, "");
    }
    
    public static ArrayList<String> helper( int[][] m , int n , int i , int j ,  boolean[][] visited, String path){
        //use backtracking as well
        ArrayList<String> ans= new ArrayList<String>();
        if(i==n-1 && j==n-1 && m[n-1][n-1]==1){
            ans.add(path);
            return ans;
        }
        
        if( i>=n || i<0 || j>=n || j<0){
            //System.out.println("no1");
            return ans;
        }
        if(m[i][j]==0|| visited[i][j]==true){
            //System.out.println("no2");
            return ans;
        }
        //System.out.println("yes");
        
        visited[i][j]=true;
        ArrayList<String> ans1= helper(m, n , i+1, j , visited, path + 'D');
        ArrayList<String> ans2=helper(m, n , i-1, j , visited, path + 'U');
        ArrayList<String> ans3=helper(m, n , i, j+1 , visited, path + 'R');
        ArrayList<String> ans4=helper(m, n , i, j-1 , visited, path + 'L');
        
        visited[i][j]=false;
        
        ans.addAll( ans1); ans.addAll( ans2); ans.addAll( ans3); ans.addAll( ans4);
        
        return ans;
        
    }
}
