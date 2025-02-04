class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for ( int i=0; i<=(t.length()-p.length()); i++ ) {
			long target = Long.parseLong(t.substring(i, p.length()+i));
			if ( Long.parseLong(p) >= target ) answer++;
		}
        
        return answer;
    }
}