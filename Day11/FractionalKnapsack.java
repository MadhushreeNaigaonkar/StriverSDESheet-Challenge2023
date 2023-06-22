

/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        double[][] ans=new double[n][3];
        for(int i=0;i<n;i++){
            ans[i][0]=arr[i].value;
            ans[i][1]=arr[i].weight;
            ans[i][2]=ans[i][0]/ans[i][1];
            
        }
          Arrays.sort(ans, Comparator.comparingDouble(o -> -o[2]));
        double currW=W;
        double maxv=0;
        for(int i=0;i<n;i++){
            if(ans[i][1]<=currW){
                currW-=ans[i][1];
                maxv+=ans[i][0];
            }else{
                maxv+=ans[i][0]*(currW/ans[i][1]);
                break;
            }
        }
        return maxv;
    }
}