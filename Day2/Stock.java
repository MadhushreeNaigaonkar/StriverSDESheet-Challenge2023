
class Solution {
    public int maxProfit(int[] prices) {
        int buy_p=Integer.MAX_VALUE;
        int p=0;
        int max_profit=0;
        
        for(int i=0;i<prices.length;i++){
            if(buy_p<prices[i]){
                p=prices[i]-buy_p;
                max_profit=Math.max(p,max_profit);
                
            }
            else{
                buy_p=prices[i];
            }
        }
        return max_profit;
    
    }
}