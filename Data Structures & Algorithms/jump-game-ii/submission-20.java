class Solution {

    public int jump(int[] nums) {
        Integer[] dp = new Integer[nums.length];
        return dfs(nums, 0, dp);
    }

    private int dfs(int[] nums, int i, Integer[] dp) {

        if (i >= nums.length - 1) {
            return 0;
        }

        if (dp[i] != null) {
            return dp[i];
        }

        int ans = Integer.MAX_VALUE;

        for (int jump = 1; jump <= nums[i]; jump++) {

            int next = dfs(nums, i + jump, dp);

            // Only use reachable states
            if (next != Integer.MAX_VALUE) {
                ans = Math.min(ans, 1 + next);
            }
        }

        dp[i] = ans;
        return ans;
    }
}