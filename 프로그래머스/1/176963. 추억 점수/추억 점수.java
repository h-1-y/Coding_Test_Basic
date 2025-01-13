import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        int [] answer = new int[photo.length];
		Map<String, Integer> map = new HashMap<>();
		int sum = 0;
		
		for ( int i=0; i<name.length; i++ )
			map.put(name[i], yearning[i]);
		
		for ( int i=0; i<photo.length; i++ ) {
            
			for ( int j=0; j<photo[i].length; j++ ) {
				for ( String key : map.keySet() ) 
                    if ( photo[i][j].equals(key) ) sum += map.get(key);
			}
            
			answer[i] = sum;
			sum = 0;
            
		}
        
        return answer;
    }
}