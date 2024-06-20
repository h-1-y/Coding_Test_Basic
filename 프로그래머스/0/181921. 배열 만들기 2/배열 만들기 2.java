import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        String num_str = "";
		List<Integer> list = new ArrayList<>();
		
		for ( int i=l; i<=r; i++ ) {
			for ( String s : (i+"").split("") ) {
				if ( s.equals("5") || s.equals("0") ) num_str += s;
				else {
					num_str = "";
					break;
				}
			}
			if ( !num_str.equals("") ) list.add(Integer.parseInt(num_str));
            num_str = "";
		}
		
		if ( list.size() == 0 ) list.add(-1);
		
        int [] answer = new int[list.size()];
        
        for ( int i=0; i<answer.length; i++ ) answer[i] = list.get(i);
        
		return answer;
            
    }
}