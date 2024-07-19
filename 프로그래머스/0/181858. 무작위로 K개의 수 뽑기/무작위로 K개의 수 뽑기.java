import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        
        List<Integer> list = new ArrayList<>();
        
        for ( int i : arr ) 
			if ( list.indexOf(i) == -1 && list.size() < k ) list.add(i);
		
		if ( list.size() != k ) {
			int size = list.size();
			for ( int i=0; i<k-size; i++ ) list.add(-1);
		}
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}