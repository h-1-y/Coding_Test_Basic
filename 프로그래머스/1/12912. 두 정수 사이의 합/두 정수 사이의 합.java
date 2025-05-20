class Solution {
    public long solution(int a, int b) {
        
        int x = a < b ? a : b;
		int y = a > b ? a : b;
		long answer = x;
		
		for ( int i=x+1; i<=y; i++ ) 
			answer += i;
        
        return answer;
        
    }
}