import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        int answer = 0;
		int idx = 0;
		Arrays.sort(numbers);
		
		for ( int i=0; i<=9; i++ ) {
			if ( i != numbers[idx] ) answer += i;
			else if ( numbers.length-1 > idx ) idx++;
		}
        
        return answer;
    }
}