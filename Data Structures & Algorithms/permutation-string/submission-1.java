class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        int[] freq1=new int[26];
        for(int i=0; i<s1.length(); i++){
            freq1[s1.charAt(i) - 'a']++;

        }
        int n =s1.length();
        int[] freq2 = new int[26];
        for(int i=0; i<s2.length(); i++){
            freq2[s2.charAt(i) -'a']++;

            if((i-left+1) > n){
                freq2[s2.charAt(left) -'a']--;
                left++;
            }
            if((i-left+1)==n){
                if (Arrays.equals(freq1, freq2)) {
    return true;
}
            }
        }
        return false;
        
        
    }
}
