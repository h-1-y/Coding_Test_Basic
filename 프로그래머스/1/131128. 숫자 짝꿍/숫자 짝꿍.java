import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        
        String answer = ""; 
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		
		for ( int i=0; i<X.length(); i++ ) 
			map.put(X.charAt(i)+"", map.get(X.charAt(i)+"")==null ? 1 : map.get(X.charAt(i)+"")+1);
		for ( int i=0; i<=9; i++ ) 
			map.put(i+"", map.get(i+"")==null ? 0 : map.get(i+""));
		for ( int i=0; i<Y.length(); i++ ) 
			map2.put(Y.charAt(i)+"", map2.get(Y.charAt(i)+"")==null ? 1 : map2.get(Y.charAt(i)+"")+1);
		for ( int i=0; i<=9; i++ ) 
			map2.put(i+"", map2.get(i+"")==null ? 0 : map2.get(i+""));
		
		for ( int i=0; i<=9; i++ ) {
			
			if ( map.get(i+"") == 0 || map2.get(i+"") == 0 ) continue;
			else { 
				int cnt = 0;
				
				if ( map.get(i+"") <= map2.get(i+"") ) cnt = map.get(i+"");
				else cnt = map2.get(i+"");
				
				answer += (i+"").repeat(cnt);
			}
			
		}
		
		if ( answer.equals("") ) answer = "-1";
		else if ( answer.replace("0", "").equals("") ) answer = "0";
		else {
			String[] arr = answer.split("");
			Arrays.sort(arr, Collections.reverseOrder());
			answer = String.join("", arr);
		}
        
        return answer;
        
    }
}