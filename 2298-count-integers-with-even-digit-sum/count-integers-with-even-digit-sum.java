class Solution {
    public int countEven(int num) {
        int ans = 0;
        for(int i = 1; i <= num; i++){
            int sum = sumDigit(i);
            if(sum % 2 == 0){
                ans++;
            }
        }
        return ans;
    }

    private int sumDigit(int i){
        int sum = 0;
        while(i > 0){
            sum += i%10;
            i /= 10;
        }
        return sum;
    }
}