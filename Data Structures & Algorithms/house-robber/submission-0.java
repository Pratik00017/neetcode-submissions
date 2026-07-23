class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[ nums.length];

        
        return dfs(nums, 0, dp);
    }
    private int dfs(int[] nums, int i, int[]dp){
        if(nums.length <= i){
            return 0;
        }
        if(dp[i]!=0){
            return dp[i];
        }

        int max = nums[i] + dfs(nums, i+2, dp);
        int rob = dfs(nums, i+1, dp);

        dp[i]= Math.max(max, rob);
        return dp[i];
    }
}
