import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        
        int answer = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for ( String str : strArr ) 
			if ( map.get(str.length()) == null ) map.put(str.length(), 1);
			else map.put(str.length(), map.get(str.length()) + 1);
		
		for ( Integer i : map.keySet() ) 
			answer = answer < map.get(i) ? map.get(i) : answer;
        
        return answer;
    }
}