class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int i = Integer.parseInt("" + a + b);
        int j = 2 * a * b;
        
        answer = ( i >= j ? i : j );
        
        return answer;
    }
}