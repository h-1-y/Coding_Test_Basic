class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for ( String str : dic ) {
			
			String target = str;
			
			for ( String replceStr : spell ) 
				target = target.replaceFirst(replceStr, "");
			
			if (target.length() == (str.length() - spell.length)) {
				return 1;
			}
			
		}
        
        return 2;
    }
}