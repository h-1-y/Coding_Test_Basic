class Solution {
    public int[] solution(int n, int m) {
        
        int[] answer = new int[2];
		
		for ( int i=1; i<=n; i++ ) 
			if ( n%i == 0 && m%i == 0 ) answer[0] = i;
		
		int n2 = n;
		int m2 = m;
		
		while ( n2 != m2 ) {
			if ( n2 < m2 ) n2 = n2+n;
			else m2 = m2+m;
		}
		
		answer[1] = n2;
        
        return answer;
    }
}