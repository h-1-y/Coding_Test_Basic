class Solution {
    public int solution(String my_string) {
        
        String target = "";
		int answer = 0;
		
		for ( char c : my_string.toCharArray() ) {
			
			if ( Character.isDigit(c) ) target += c+"";
			else if ( !target.equals("") ) {
				answer += Integer.parseInt(target);
				target = "";
			}
			
		}
		
		if ( !target.equals("") ) answer += Integer.parseInt(target);
        
        return answer;
    }
}