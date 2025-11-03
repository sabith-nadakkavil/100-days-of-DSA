class Solution {
    public int fib(int n) {
       int[] fibs = new int[n + 1];
       Arrays.fill(fibs, -1);
       return helper(n, fibs); 
    }
    private int helper(int n, int[] fibs){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(fibs[n] != -1) return fibs[n];

        fibs[n] = helper(n-1, fibs) + helper(n-2, fibs);
        return fibs[n];
    }
}