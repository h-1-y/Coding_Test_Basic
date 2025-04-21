import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        
        int len = arr.length == 1 ? 1 : arr.length-1;
		int[] answer = new int[len];
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		list.remove(Collections.min(list));
		
		if ( len == 1 ) answer[0] = -1;
		else for ( int i=0; i<len; i++ ) answer[i] = list.get(i);
        
        return answer;
        
    }
}