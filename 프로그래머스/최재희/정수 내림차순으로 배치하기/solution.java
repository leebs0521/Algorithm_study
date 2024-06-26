import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list, Collections.reverseOrder());;
        
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < list.length; i++) {
            sb.append(list[i]);
        }
        String result = sb.toString();
        
        return Long.parseLong(result);
    }
}