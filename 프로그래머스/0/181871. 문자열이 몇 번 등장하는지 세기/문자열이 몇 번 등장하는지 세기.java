class Solution {
    public int solution(String myString, String pat) {
        
        int cnt = 0;
		String match = "";
		
		for ( int i=0; i<=myString.lastIndexOf(pat); i++ ) {
			
			for ( int j=i; j<pat.length()+i; j++ ) match += myString.charAt(j);
			
			if ( match.equals(pat) ) cnt++;
			
			match = "";
			
		}
        
        return cnt;
    }
}