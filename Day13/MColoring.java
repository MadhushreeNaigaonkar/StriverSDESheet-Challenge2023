package Day13;



class solve {
   
    public boolean graphColoring(boolean graph[][], int m, int n) {
        
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
       for(int i = 0; i < n; i++){
           adj.add(new ArrayList<>());
       }
       
       int row = graph.length;
       int col = graph[0].length;
       for(int i = 0; i < row; i++){
           for(int j = 0; j < col; j++){
               if(graph[i][j]){
                   adj.get(j).add(i);
                   adj.get(i).add(j);
                   }
           }
       }
       
       int color[] = new int[n];
       
       return check(adj, color, m, n, 0);
       
    }
    
    public boolean check(ArrayList<ArrayList<Integer>> adj, int color[], int m, int n, int c){
        if(c == n){
            return true;
        }
        
        for(int i = 1; i <= m; i++){
            if(isPossible(adj, color, i, c)){
                color[c] = i;
                if(check(adj, color, m, n, c+1))
                return true;
            }
        }
         return false;
    }
    
    public boolean isPossible(ArrayList<ArrayList<Integer>> adj, int color[], int i, int c){
        
        for(int it : adj.get(c)){
            if(color[it] == i)
            return false;
        }
        return true;
    }
    
}






