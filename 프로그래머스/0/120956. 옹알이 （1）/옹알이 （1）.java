class Solution {
    public int solution(String[] babbling) {
        
        String [] target = { "aya", "ye", "woo", "ma" };
		int answer = 0;
		
		for ( String str : babbling ) {
			
			String replace = str;
			int len = str.length();
			
			for ( String tar : target ) {
				replace = replace.replace(tar, "*".repeat(tar.length()));
			}
			
			String check = "*";
			
			if ( replace.equals(check.repeat(len)) ) answer++;
			
		}
        
        return answer;
    }
}