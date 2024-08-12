class Solution {
    public int solution(int n) {
        int count = 0;
		int sum = 0;
		
		for ( int i=4; i<=n; i++ ) {
			
			for ( int j=1; j<=i; j++ ) if ( i%j == 0 ) count++;
			
			if ( count >= 3 ) sum++;
			count = 0;
			
		}
        
        return sum;
    }
}