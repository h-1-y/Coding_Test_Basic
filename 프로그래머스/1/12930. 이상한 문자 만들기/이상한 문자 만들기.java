class Solution {
    public String solution(String s) {
        
        String answer = "";
        int idx = 0;
        
        for ( int i=0; i<s.length(); i++ ) {
			
			answer += idx%2 == 0 ? (s.charAt(i)+"").toUpperCase() : (s.charAt(i)+"").toLowerCase();
			
			if ( s.charAt(i) == ' ' ) idx = 0;
			else idx++;
			
		}
        
        return answer;
        
    }
}