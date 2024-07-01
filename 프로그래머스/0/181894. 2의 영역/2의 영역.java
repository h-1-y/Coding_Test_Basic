import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		List<Integer> return_list = new ArrayList<>();
		
		if ( list.indexOf(2) != -1 )
			for ( int i=list.indexOf(2); i<=list.lastIndexOf(2); i++ ) 
				return_list.add(list.get(i));
		if ( return_list.size() == 0 ) return_list.add(-1);
        
        return return_list.stream().mapToInt(i -> i).toArray();
    }
}