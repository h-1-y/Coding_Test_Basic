import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        String intStr = "";
		List<Integer> arr = new ArrayList<>();
		
		for ( String str : intStrs ) {
			
			for ( int i=0; i<l; i++ ) intStr += str.charAt(s+i);
			
			if ( Integer.parseInt(intStr) > k ) arr.add(Integer.parseInt(intStr));
			intStr = "";
			
		}
        
        return arr.stream().mapToInt(i -> i).toArray();
    }
}