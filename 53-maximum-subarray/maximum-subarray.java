class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, n = nums.length, curSum = 0;
        for(int i = 0; i < n; i++){
            curSum += nums[i];
            maxSum = Math.max(maxSum, curSum);
            if (curSum < 0)
                curSum = 0;
        }
        return maxSum;
    }
}