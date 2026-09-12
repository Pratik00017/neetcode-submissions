class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        int count=0;
        HashSet<Integer>set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]-1)){
int current=nums[i];
            while(set.contains(current)){
                current++;
                count++;
            }
            }
            max= Math.max(count, max);
            count=0;
        }
        return max;
    }
}
