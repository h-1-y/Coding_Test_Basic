import java.util.*;

class Solution {
    public int[] solution(String myString) {
        
        List<Integer> list = new ArrayList<>();
		int cnt = 0;
		
		for ( String str : myString.split("") ) {
			
			if ( str.equals("x") ) {
				list.add(cnt);
				cnt = 0;
			} else cnt++;
			
		}
		
		list.add(cnt);
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}