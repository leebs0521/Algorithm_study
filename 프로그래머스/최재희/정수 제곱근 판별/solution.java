class Solution {
    public long solution(long n) {
        long answer;
        double x = Math.sqrt(n);
        
        if ( x % 1 == 0 ) {
            double doubleAnswer = Math.pow(x+1, 2);
            return answer = (long)doubleAnswer;
        } else {
            return -1;
        }
    }
}