class Solution {
    public int solution(int[] numbers, int k) {
        
        int cnt = 1;
		int i = 0;
		int answer = 0;
		
		while ( cnt < k ) {
			
			i+=2;
			cnt++;
			
			if ( i >= numbers.length ) i = (i == numbers.length) ? 0 : (i-numbers.length);
			if ( cnt == k ) answer = numbers[i];
			
		}
        
        return answer;
    }
}