class Solution {
    public int solution(int n) {
      
        int i = 1;
		int result = 0;
		
		while( result < n ) {
			
			result = i * i;
			i++;
			
		}
        
        return n == result ? 1 : 2;
    }
}