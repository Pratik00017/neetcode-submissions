class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int count[]=new int[26];
        int count2[]= new int[26];
        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
        }
        for(int i=0; i<s2.length(); i++){
            count2[s2.charAt(i) -'a']++;
            int k =s1.length();
            if(i >= k){
                count2[s2.charAt(i-k) -'a']--;
            }

            if(Arrays.equals(count, count2)){
                return true;
            }
        }
        return false;
        
    }
}
