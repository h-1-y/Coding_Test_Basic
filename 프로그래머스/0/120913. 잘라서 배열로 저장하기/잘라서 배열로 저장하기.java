class Solution {
    public String[] solution(String my_str, int n) {
        
        String [] answer = new String[(my_str.length()%n > 0) ? (my_str.length()/n + 1) : (my_str.length()/n)];
		String text = "";
		int count = 0;
		int idx = 0;
		
		for ( String str : my_str.split("") ) {
			
			text += str;
			count++;
			
			if ( count >= n ) {
				answer[idx++] = text;
				text = "";
				count = 0;
			}
			
		}
		
		if ( my_str.length()%n > 0 ) 
            answer[idx] = my_str.substring(n*(my_str.length()/n), my_str.length());
        
        return answer;
    }
}