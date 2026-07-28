class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxFreq =0;
        int answer=0;
        int[] freq = new int[26];
        // HashMap<Character, Integer> map = new HashMap<>();

        for(int right=0; right < s.length(); right++){
            freq[s.charAt(right) - 'A']++;
           
            maxFreq = Math.max(maxFreq, freq[s.charAt(right)- 'A']);

            while((right - left + 1)-maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }
        return answer;
        
    }
}
