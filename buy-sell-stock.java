class Solution {
   
    public int maxProfit(int[] prices) {
        int min = prices[0];
         int max_dif=0;
        for(int i= 1; i< prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
            }
            else if(prices[i]-min > max_dif){
                    max_dif = prices[i]-min;
                }
        }
        return max_dif;
    }
}
