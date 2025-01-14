import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> map = new HashMap<>();
		
		for ( int i=0; i<players.length; i++ ) 
			map.put(players[i], i);
		
		for ( int i=0; i<callings.length; i++ ) {
			
			int call = map.get(callings[i]);
			int target = map.get(callings[i])-1;
			
			players[call] = players[target];
			players[target] = callings[i];
			
			map.put(callings[i], target);
			map.put(players[call], call);
			
		}
        
        return players;
        
    }
}