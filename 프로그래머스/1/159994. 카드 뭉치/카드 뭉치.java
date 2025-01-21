import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        int idx1 = 0;
		int idx2 = 0;
		
		for ( String str : goal ) {
			if ( Arrays.asList(cards1).indexOf(str) != -1 ) {
				if ( idx1 == Arrays.asList(cards1).indexOf(str) ) idx1++;
			} else if ( Arrays.asList(cards2).indexOf(str) != -1 ) {
				if ( idx2 == Arrays.asList(cards2).indexOf(str) ) idx2++;
			}
		}
        
        return (idx1+idx2) == goal.length ? "Yes" : "No";
    }
}