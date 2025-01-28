class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        int[] answer = new int[targets.length];
		
		for ( int i=0; i<targets.length; i++ ) {
			
			int sum = 0;
			
			for ( int j=0; j<targets[i].length(); j++ ) {
				
				int idx = 0;
				
				for ( int k=0; k<keymap.length; k++ ) {
					
					int idxOf = keymap[k].indexOf(targets[i].charAt(j));
					idxOf = idxOf != -1 ? idxOf+1 : idxOf;
					
					if ( idx == 0 ) idx = idxOf;
					else if ( idx == -1 ) idx = idxOf;
					else idx = (idxOf < idx && idxOf != -1) ? idxOf : idx;
					
				}
				
				sum = (idx == -1 || sum == -1) ? -1 : (sum+idx);
				
			}
			
			answer[i] = sum;
			
		}
        
        return answer;
    }
}