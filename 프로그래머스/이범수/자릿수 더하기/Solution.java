class Solution {
    public int solution(int n) {
        String nStr = Integer.toString(n);
        int sum = 0;

        for (int i=0; i<nStr.length(); i++) {
            sum += Integer.parseInt(nStr.charAt(i)+"");
        }

        return sum;
    }
}