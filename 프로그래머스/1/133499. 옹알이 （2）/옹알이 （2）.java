class Solution {
    public int solution(String[] babbling) {
        
        String[] arr = { "aya", "ye", "woo", "ma" };
		int answer = 0; 		
		
		for ( String say : babbling ) {
			
			String str = say;
			String matching = str.toUpperCase();
			String change = "";
			boolean loop = true;
			int idx = 0;
			int cnt = 0;
			
			while ( loop ) {
				
				if ( idx == 4 ) idx = 0;
				
				if ( str.contains(arr[idx]) ) {
					
					if ( str.indexOf(arr[idx]) > 0 ) {
						int begin = str.indexOf(arr[idx]) - arr[idx].length() < 0 ? 0 : str.indexOf(arr[idx]) - arr[idx].length();
						int end = str.indexOf(arr[idx]);
						if ( str.substring(begin, end).toLowerCase().equals(arr[idx]) ) break;
						else {
							str = str.replaceFirst(arr[idx], arr[idx].toUpperCase());
							cnt = 0;
						}
					} else {
						str = str.replaceFirst(arr[idx], arr[idx].toUpperCase());
						cnt = 0;
					}
					
				}
				else {
					idx++;
					cnt++;
				}
				
				if ( cnt == 4 ) loop = false;
				
			}
			
			answer += str.equals(matching) ? 1 : 0;
			
		}
        
        return answer;
    }
}