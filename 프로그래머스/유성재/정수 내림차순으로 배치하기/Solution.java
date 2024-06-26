import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String answ = "";
        String input = n+"";
        String[] num = input.split("");
        Arrays.sort(num);
        for(int i =0; i<num.length; i++){
            answ = answ + num[num.length-1-i];
        }
        answer = Long.parseLong(answ);
        return answer;
    }
}