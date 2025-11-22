class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;
        for(int h : hours){
            if(h >= target){
                ans++;
            }
        }
        return ans;
    }
}