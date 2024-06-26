import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int reCount = 0;
        for(int i=0; i < arr.length; i++) {
            if (arr[i]  % divisor == 0) {
                reCount++;
            }
        }
        
        if (reCount == 0) {
        int [] answer = {-1};
        return answer;
        }
        
        int[] answer = new int[reCount];
        reCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[reCount] = arr[i];
                reCount++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}