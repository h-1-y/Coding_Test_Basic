class Solution {
    boolean solution(String s) {
        
        int p = 0;
		int y = 0;
		
		s = s.toUpperCase();
		
		for ( int i=0; i<s.length(); i++ ) {
			p = s.charAt(i) == 'P' ? p+1 : p;
			y = s.charAt(i) == 'Y' ? y+1 : y;
		}

        return p==y ? true : false;
    }
}