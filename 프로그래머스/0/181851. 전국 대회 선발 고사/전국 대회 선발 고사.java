import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        int [] answer = new int[3];
        List<Integer> list = new ArrayList<>();
		
		for ( int i=0; i<rank.length; i++ ) if ( attendance[i] ) list.add(rank[i]);
		Collections.sort(list);
		
		for ( int i=0; i<3; i++ ) 
			for ( int j=0; j<rank.length; j++ ) 
				if ( list.get(i) == rank[j] ) answer[i] = j;
        
        return 10000 * answer[0] + 100 * answer[1] + answer[2];
    }
}