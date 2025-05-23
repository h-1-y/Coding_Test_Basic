class Solution {
    public long solution(long n) {
        
        long x = 0;
		long idx = 0;
		
		while( x < n ) {
			++idx;
			x = idx * idx;
		}
        
        return x == n ? (idx+1)*(idx+1) : -1;
        
    }
}