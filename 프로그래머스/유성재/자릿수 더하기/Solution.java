import java.util.*;

public class Solution {
    public int solution(int n) {
        String inputum = n+"";
        String[] strnum = inputum.split("");
        int answer = 0;
        for(int i = 0; i<strnum.length; i++){
            answer = answer+Integer.parseInt(strnum[i]);
        }

        return answer;
    }
}