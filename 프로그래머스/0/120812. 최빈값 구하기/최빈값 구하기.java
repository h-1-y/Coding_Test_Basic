import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        
        int keyValue = 0;
		int answer = 0;
		
		Map<String, Integer> map = new HashMap<>();		
		
		for ( int i : array ) 
            map.put(i+"", map.get(i+"") == null ? 1 : map.get(i+"") + 1);
		
		for ( String key : map.keySet() ) 
			if ( keyValue == map.get(key) ) answer = -1;
			else if ( keyValue < map.get(key) ) {
				keyValue = map.get(key);
				answer = Integer.parseInt(key); 
			}
        
        return answer;
    }
}