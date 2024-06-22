package 프로그래머스.유성재.짝수와 홀수;

class Solution {
    public String solution(int num) {
        String answer = num % 2 ==0 ? "Even":"Odd";
        return answer;
    }
}