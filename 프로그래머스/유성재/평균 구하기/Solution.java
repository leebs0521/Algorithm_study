class Solution {
    public double solution(int[] arr) {
        double add = 0;
        double answer =0;
        for (int i=0; i<arr.length;i++){
            add = add+arr[i];
        }
        answer = add/arr.length;
        return answer;
    }
}