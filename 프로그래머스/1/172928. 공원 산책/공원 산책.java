class Solution {
    public int[] solution(String[] park, String[] routes) {
        
		int [] answer = new int[2];
		
		for ( int i=0; i<park.length; i++ ) {
			if ( park[i].indexOf("S") != -1 ) {
				answer[0] = i;
				answer[1] = park[i].indexOf("S");
			}
		}
		
		for ( String move : routes ) {
			
			String [] moveArr = move.split(" ");
			String ewsn = moveArr[0];
			int step = Integer.parseInt(moveArr[1]);
			
			int h = answer[0];
			int w = answer[1];
			
			if ( ewsn.equals("E") ) {
				if ( (w+step) <= (park[h].length())-1 ) { // 거리 체크
					if ( !park[h].substring(w+1, w+step+1).contains("X") ) { // X 체크
						w = w+step;
					}
				}
			} else if ( ewsn.equals("W") ) {
				if ( (w-step) >= 0 ) { // 거리 체크
					if ( !park[h].substring(w-step, w).contains("X") ) { // X 체크
						w = w-step;
					}
				}
			} else if ( ewsn.equals("S") ) {
				if ( (h+step) <= (park.length-1) ) { // 거리 체크
					boolean xCheck = false;
					for ( int i=(h+1); i<=(h+step); i++ ) { 
						if ( park[i].substring(w, w+1).equals("X") ) { // X 체크 
							xCheck = true;
							break;
						}
					}
					h = !xCheck ? (h+step) : h;
				}
			} else if ( ewsn.equals("N") ) {
				if ( (h-step) >= 0 ) { // 거리 체크
					boolean xCheck = false;
					for ( int i=(h-1); i>=(h-step); i-- ) {
						if ( park[i].substring(w, w+1).equals("X") ) { // X 체크 
							xCheck = true;
							break;
						}
					}
					h = !xCheck ? (h-step) : h;
				}
			}
			
			answer[0] = h;
			answer[1] = w;
			
		}
        
        return answer;
    }
}