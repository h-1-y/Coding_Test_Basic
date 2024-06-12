class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for ( int i=n; i>=1; i-- ) {
            
            if ( n%2 == 0 ) answer += i*i;
            else answer += i;
            
            i--;
                
        }
        
        return answer;
    }
}