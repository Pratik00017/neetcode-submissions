class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2 || prices == null){
            return 0;
        }
        int profit= prices[0];
        int maxx=0;


        for(int i=1; i<prices.length; i++){
            int max= prices[i] - profit;
            maxx = Math.max(maxx, max);
            profit=Math.min(profit, prices[i]);
             }
             return maxx;
        
    }
}
