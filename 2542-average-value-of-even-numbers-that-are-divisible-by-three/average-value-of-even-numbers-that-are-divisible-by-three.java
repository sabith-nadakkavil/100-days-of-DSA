class Solution {
    public int averageValue(int[] nums) {
        int ans = 0;
        int sum = 0;
        int count = 0;
        for (int num : nums){
            if(num % 2 == 0 && num % 3 == 0){
                count++;
                sum += num;
            }
        }
        if (count != 0){
            ans = sum / count;
        }
        return ans;
    }
}