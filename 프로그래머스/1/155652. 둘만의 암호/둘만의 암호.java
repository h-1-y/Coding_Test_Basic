class Solution {
    public String solution(String s, String skip, int index) {
        
        String answer = "";
		
		for ( char c : s.toCharArray() ) {
			
			int ascii = c+0;
			int cnt = 0;
			int step = index;
			
			while ( cnt != step ) {
				
				ascii++;
				ascii = ascii > 122 ? (ascii-26) : ascii;
				cnt++;
				
				if ( skip.contains((char)ascii+"") ) step++;
				
			}
			
			answer += (char)ascii;
			
		}
        
        return answer;
        
    }
}