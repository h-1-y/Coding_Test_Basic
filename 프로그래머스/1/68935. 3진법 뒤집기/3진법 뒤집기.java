class Solution {
    public int solution(int n) {
        
        String str = Integer.toString(n, 3);
		String str2 = "";
		
		for ( int i=str.length()-1; i>=0; i-- ) 
			str2 += str.charAt(i);
        
        return Integer.parseInt(str2, 3);
    }
}