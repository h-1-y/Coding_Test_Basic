import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int n = -1;
		List<Integer> list = new ArrayList<>();
		
		for ( int i : arr ) {
			if ( i != n ) {
				list.add(i);
				n = i;
			} else continue;
		}

        return list.stream().mapToInt(i -> i).toArray();
    }
}