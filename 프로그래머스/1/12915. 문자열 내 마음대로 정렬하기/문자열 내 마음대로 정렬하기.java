import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        String[] answer = new String[strings.length];
		String[] arr = new String[strings.length];

		Arrays.sort(strings);
		
		for ( int i=0; i<strings.length; i++ ) 
			arr[i] = strings[i].substring(n, n+1);
		
		Arrays.sort(arr);
		
		for ( int i=0; i<arr.length; i++ ) {
			for ( int j=0; j<arr.length; j++ ) {
				if ( strings[j].substring(n, n+1).equals(arr[i]) ) {
					answer[i] = strings[j];
					strings[j] = "*".repeat(strings[j].length());
					break;
				}
			}
		}
        
        return answer;
    }
}