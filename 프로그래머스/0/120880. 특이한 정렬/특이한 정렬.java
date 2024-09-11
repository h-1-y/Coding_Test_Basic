import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        int [] answer = new int[numlist.length];
		
		List<Integer> num = Arrays.stream(numlist).boxed().collect(Collectors.toList());
		List<Integer> list = new ArrayList<>();
		
		for ( int i : numlist ) list.add(i-n > 0 ? -(i-n) : i-n);
		
		Collections.sort(num, Collections.reverseOrder());
		Collections.sort(list, Collections.reverseOrder());
		
		int index = 0;
		
		for ( int i=0; i<list.size(); i++ ) {
			for ( int j=0; j<num.size(); j++ ) {
				
				int target = num.get(j)-n > 0 ? -(num.get(j)-n) : num.get(j)-n;
				if ( list.get(i) == target ) {
					answer[index++] = num.get(j);
					num.remove(j);
				}
				
			}
		}
        
        return answer;
    }
}