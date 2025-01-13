import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        Map<String, Map<String, Integer>> map = new HashMap<>();
		
		for ( int i=0; i<friends.length; i++ ) {
			
			Map<String, Integer> giftMap = new HashMap<>();
			
			for ( String name : friends ) 
				if ( !friends[i].equals(name) ) giftMap.put(name, 0);
			
			for ( String gift : gifts ) {
				String [] giftArr = gift.split(" ");
				String from = giftArr[0];
				String to = giftArr[1];
				
				if ( friends[i].equals(from) ) giftMap.put(to, giftMap.get(to) + 1);
			}
			
			map.put(friends[i], giftMap);
			
		}
		
		// 준 선물 수, 받은 선물 수, 선물 지수 put
		for ( String name : friends ) {
			
			Map<String, Integer> from = map.get(name);
			int fromCount = 0;
			int toCount = 0;
			
			for ( String name2 : friends ) {
				if ( !name.equals(name2) ) {
					Map<String, Integer> to = map.get(name2);
					toCount += to.get(name);
					fromCount += from.get(name2);
				}
			}
			
			from.put("fromCount", fromCount);
			from.put("toCount", toCount);
			from.put("giftPoint", fromCount - toCount);
			map.put(name, from);
			
		}
		
		int sum = 0;
		
		// 다음달 선물 put
		for ( String name : friends ) {
			
			Map<String, Integer> from = map.get(name);
			
			for ( String name2 : friends ) {
				if ( !name.equals(name2) ) {
					Map<String, Integer> to = map.get(name2);
					
					if ( from.get(name2) > to.get(name) ) sum++;
					else if ( from.get(name2) == to.get(name) ) {
						if ( from.get("giftPoint") > to.get("giftPoint") ) sum++;
					}
				}
			}
			
			from.put("sum", sum);
			map.put(name, from);
			
			sum = 0;
			
		}
		
		int answer = 0;
		
		for ( String name : friends ) {
			
			Map<String, Integer> target = map.get(name);
			answer = target.get("sum") > answer ? target.get("sum") : answer;
			
		}
        
        return answer;
    }
}