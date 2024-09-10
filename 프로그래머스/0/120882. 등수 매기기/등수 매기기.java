import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        
        Double [] avg = new Double[score.length];
		int [] answer = new int[score.length];
		Double [] avgSort = new Double[score.length];
		Map<Double, Integer> map = new HashMap<>();
		int rank = 0;
		
		for ( int i=0; i<score.length; i++ ) {
			avgSort[i] = (((double)score[i][0]+(double)score[i][1])/2);
			avg[i] = avgSort[i];
		}
		
		Arrays.sort(avgSort, Collections.reverseOrder());
		
		for ( int i=0; i<avgSort.length; i++ ) 
			if ( map.get(avgSort[i]) == null ) map.put(avgSort[i], ++rank);
			else rank++;
		
		for ( int i=0; i<avg.length; i++ ) 
			for ( Double key : map.keySet() ) 
				if ( Double.compare(avg[i], key) == 0 ) 
					answer[i] = map.get(key);
        
        return answer;
        
    }
}