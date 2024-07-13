class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        alp = alp.toLowerCase();
		
		for ( String str : my_string.split("") )
			answer += str.equals(alp) ? str.toUpperCase() : str.toLowerCase();
        
        return answer;
    }
}