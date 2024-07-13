class Solution {
    public String solution(String myString) {
        String answer = "";
        
        myString = myString.toLowerCase();
        
        for ( String str : myString.split("") ) 
			answer += str.equals("a") ? str.toUpperCase() : str.toLowerCase();
        
        return answer;
    }
}