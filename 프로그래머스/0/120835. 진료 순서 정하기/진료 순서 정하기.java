class Solution {
    public int[] solution(int[] emergency) {
        int[] clone = emergency.clone();
        int[] answer = new int[emergency.length];
        int temp = 0;
		
		for ( int i=0; i<clone.length; i++ ) {
			for ( int j=0; j<clone.length; j++ ) {
				if ( clone[i] > clone[j] ) {
					temp = clone[i];
					clone[i] = clone[j];
					clone[j] = temp;
				}
			}
		}
		
		for ( int i=0; i<clone.length; i++ ) 
			for ( int j=0; j<clone.length; j++ ) 
				if ( emergency[i] == clone[j] ) answer[i] = j+1;
			
        
        return answer;
    }
}