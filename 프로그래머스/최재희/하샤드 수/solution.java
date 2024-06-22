class Solution {
    public boolean solution(int x) {
        boolean answer = true;  // answer 선언
        int sum = 0;  // 자릿수 합 선언
        int a = x;
        
        while (true) {
            sum += a % 10;
            if (a < 10) break;
            a = a / 10;
        }
        
        return answer = (x % sum == 0)? true:false;
    }
}