class Solution {
    public String[] solution(String[] picture, int k) {
        String [] answer = new String[picture.length * k];
		String fullStop = ".".repeat(k) , x = "x".repeat(k);
		int idx = 0;
		
		for ( String str : picture ) 
			for ( int i=0; i<k; i++ ) answer[idx++] = str.replace(".", fullStop).replace("x", x);
        
        return answer;
    }
}