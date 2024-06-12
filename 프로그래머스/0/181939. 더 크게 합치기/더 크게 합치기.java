class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int i = Integer.parseInt("" + a + b);
        int j = Integer.parseInt("" + b + a);
        
        if ( i >= j ) answer = i;
        else answer = j;
        
        return answer;
    }
}