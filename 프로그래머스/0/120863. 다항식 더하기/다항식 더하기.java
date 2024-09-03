class Solution {
    public String solution(String polynomial) {
        
        String answer = "";
		String [] arr = polynomial.split(" ");
		
		int xNum = 0;
		int num = 0;
		
		for ( String str : arr ) {
			
			if ( str.contains("x") ) xNum += !str.replace("x", "").equals("") ? Integer.parseInt(str.replace("x", "")) : 1;
			else if ( !str.equals("+") ) num += Integer.parseInt(str);
			
		}
		
		if ( xNum != 0 && num != 0 ) answer = ((xNum == 1 ? "" : xNum)+"x") + " + " + num;
		else answer = xNum != 0 ? ((xNum == 1 ? "" : xNum)+"x") : num != 0 ? (num+"") : "";
        
        return answer;
    }
}