class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int max = 0;

        while (l < r){
            int min = Math.min(height[l], height[r]);
            int curMax = min * (r - l);
            max = Math.max(curMax, max);

            if(height[l] < height[r]){
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}