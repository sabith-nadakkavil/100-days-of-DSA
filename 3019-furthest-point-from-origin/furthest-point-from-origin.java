class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int sum = 0; 
        int dist = 0;
        for (char c : moves.toCharArray()){
             if ( c=='R')
                sum++;
            else if ( c == 'L')
                sum--;
            else 
                dist++;
           } 
           return Math.abs(sum) + dist;
    }
}