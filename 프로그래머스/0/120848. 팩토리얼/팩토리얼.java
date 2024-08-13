class Solution {
    public int solution(int n) {
        
        int factorial = 1;
		int sum = 1;
		
		while ( sum < n ) {
			
			sum = 1;
			
			for ( int i=factorial; i>=1; i-- ) sum *= i;
			
			if ( sum < n ) factorial++;
			
		}
        
        return sum > n ? factorial-1 : factorial;
    }
}