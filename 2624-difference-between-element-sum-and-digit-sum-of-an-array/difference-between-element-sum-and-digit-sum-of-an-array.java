class Solution {
    public int differenceOfSum(int[] nums) {
        int eSum = 0;
        int dSum = 0;
        for (int n : nums){
            eSum += n;
            
            while ( n > 0){
                dSum += (n % 10);
                n /= 10;
            }
        }
        return eSum - dSum;
    }
}