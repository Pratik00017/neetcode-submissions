class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int max=0;

        for(int i=0; i < s.length(); i++){
            char len = s.charAt(i);

            while(set.contains(len)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(len);
            max = Math.max(max, i - left+1);
        }

        return max;

        
    }
}
