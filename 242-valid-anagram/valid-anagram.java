class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] cCount = new int[26];
        for(int i = 0; i < s.length(); i++){
            cCount[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < t.length(); i++){
            cCount[t.charAt(i) - 'a']--;
        }
        for(int count : cCount){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}