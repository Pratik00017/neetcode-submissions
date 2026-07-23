class Solution {
    public int climbStairs(int n) {
        int [] dp = new int[n + 1];
        return dfs(n, 0, dp);
        
    }
    private int dfs(int n, int i , int [] dp){
        
        if(i >=n) return i==n ? 1 :0 ;
        if(dp[i] != 0){
            return dp[i];
        }
        dp[i]=dfs(n, i+1, dp) + dfs(n, i+2, dp);
        return dp[i];
    }
}
