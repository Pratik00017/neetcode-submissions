class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char set = s.charAt(i);
            map.put(set, map.getOrDefault(set,0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char set = t.charAt(i);

            if(!map.containsKey(set)){
               return false;
            }
            map.put(set, map.getOrDefault(set, 0)-1);

            if(map.get(set)==0){
                map.remove(set);
            }
        }
        return map.isEmpty();
    }
}
