import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> set = new HashSet<>();
		
		for ( int i=0; i<numbers.length; i++ ) {
			for ( int j=0; j<numbers.length; j++ ) {
				if ( i == j ) continue;
				else set.add(numbers[i]+numbers[j]);
			}
		}
        
        int[] answer = new int[set.size()];
		Iterator<Integer> iter = set.iterator();
		int idx = 0;
		
		while( iter.hasNext() ) answer[idx++] = iter.next();
        Arrays.sort(answer);
        
        return answer;
    }
}