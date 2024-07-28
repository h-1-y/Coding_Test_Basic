import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        int len = arr.length;
		
		for ( int i : arr ) 
			for ( int j : delete_list ) 
				if ( i == j ) len--;
				
		int [] answer = new int[len];
		int idx = 0;
		
		for ( int i=0; i<arr.length; i++ ) {
			
			answer[idx] = arr[i];
			
			for ( int j=0; j<delete_list.length; j++ ) {
				if ( answer[idx] == delete_list[j] ) answer[idx] = 0;
			}
			
			if ( answer[idx] != 0 ) idx++;
			if ( idx >= len ) break;
			
		}
        
        return answer;
    }
}