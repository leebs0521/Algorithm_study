class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String input = x+"";
        String[] num = input.split("");
        int number = 0;
        for(int i =0; i<num.length; i++){
            number = number+ Integer.parseInt(num[i]);
        }
        if(x%number!=0){
            answer = false;

        }
        return answer;
    }
}