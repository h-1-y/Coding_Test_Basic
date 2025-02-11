import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        
        int answer = 0;
		Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
		Arrays.sort(arr, Collections.reverseOrder());
		int cnt = 0;
		
		for ( int i=0; i<arr.length; i++ ) {
			
			cnt++;
			
			if ( m == cnt ) {
				answer += arr[i]*m;
				cnt = 0;
			}
			
		}
        
        return answer;
    }
}