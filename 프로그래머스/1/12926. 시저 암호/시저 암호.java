class Solution {
    public String solution(String s, int n) {
        
        String answer = "";
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str2 = "abcdefghijklmnopqrstuvwxyz";
		
		for ( int i=0; i<s.length(); i++ ) {
			
			if ( s.charAt(i) == ' ' ) answer += " ";
			else {
				
				String target = (s.charAt(i)+0) <= 90 ? str : str2;
				
				int num = target.indexOf(s.charAt(i)) + n;
				if ( num > 25 ) num = num - 26;
				
				answer += target.charAt(num);
				
			}
			
		}
        
        return answer;
        
    }
}