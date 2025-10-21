class Solution {
    public boolean containsDuplicate(int[] nums) {
        var seen = new HashSet<Integer>();
        for(int n : nums){
            if (seen.contains(n)){
                return true;
            }
            seen.add(n);
        }
        return false;
    }
}