class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
		int paint = section[0];
		
		for ( int i : section ) {
			
			if ( paint < i ) {
				for ( int j=paint; j<i; j++ ) paint++;
			}
			
			if ( i == paint ) {
				answer++;
				paint+=m;
			}
			
		}
        
        return answer;
    }
}