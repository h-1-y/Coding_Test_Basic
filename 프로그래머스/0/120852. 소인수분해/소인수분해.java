import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        int k = 2;

		List<Integer> list = new ArrayList<>();
		
		while (n != 1) {
			if (n % k == 0) {
				if ( list.indexOf(k) == -1 ) list.add(k);
				n /= k;
			} else k++;
		}
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}