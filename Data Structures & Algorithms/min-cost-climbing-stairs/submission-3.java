class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int [] dp = new int[cost.length];
        
        return Math.min(dfs(cost, 0, dp), dfs(cost, 1 ,dp));
        
    }
    private int dfs(int[] cost, int i, int[]dp){
        if (i >= cost.length)return 0;
        if (dp[i] != 0)
            return dp[i];

        dp[i] = cost[i] + Math.min(dfs(cost, i+1, dp), dfs(cost, i+2, dp));
        return dp[i];
        
    }
}
