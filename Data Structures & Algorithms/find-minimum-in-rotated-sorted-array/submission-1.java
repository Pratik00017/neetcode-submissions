class Solution {
    public int findMin(int[] nums) {
        int minn = nums[0];
        for(int find : nums){
            minn = Math.min(find, minn);
        }
        return minn;
        
    }
}
