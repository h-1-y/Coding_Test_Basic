import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        Map<String, String> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		
		for ( String str : terms ) map.put(str.split(" ")[0], str.split(" ")[1]);
		
		for ( int i=0; i<privacies.length; i++ ) {
			
			String[] arr = privacies[i].split(" ");
			String date = arr[0];
			String limit = arr[1];
			
			int year = Integer.valueOf(date.substring(0, 4));
			int month = Integer.valueOf(date.substring(5, 7));
			int day = Integer.valueOf(date.substring(8, 10));
			int loop = Integer.valueOf(map.get(limit));
			
			day--;
			
			for ( int j=0; j<loop; j++ ) {
				
				month++;
				
				if ( month > 12 ) {
					year++;
					month = 1;
				}
				
			}
			
			if ( day == 0 ) {
				day = 28;
				month--;
			}
			
			int targetDate = Integer.valueOf((year+"") + (month < 10 ? "0"+month : month) + (day < 10 ? "0"+day : day));
			int nowDate = Integer.valueOf(today.replace(".", ""));
			
			if ( targetDate < nowDate ) list.add(i+1);
			
		}
		
		int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}