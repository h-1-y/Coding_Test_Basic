import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int cnt = 0;
		Arrays.sort(lost);
		Arrays.sort(reserve);
		
		for ( int i=0; i<lost.length; i++ )
			for ( int j=0; j<reserve.length; j++ )
				if ( lost[i] == reserve[j] ) {
					lost[i] = 0;
					reserve[j] = 0;
					cnt++;
				}
		
		int answer = n - (lost.length-cnt);
		
		for ( int i : lost ) {
			
			if ( i == 0 ) continue;
            
			for ( int j=0; j<reserve.length; j++ ) {
				if ( reserve[j] == 0 ) continue;
				if ( i == (reserve[j]-1) || i == (reserve[j]+1) ) {
					answer++;
					reserve[j] = 0;
                    break;
				}
			}
		}
        
        return answer;
        
    }
}