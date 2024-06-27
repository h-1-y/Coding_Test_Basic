class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String [] arr = my_string.split("");
		
		for ( int i : indices ) arr[i] = "";
		for ( String str : arr ) if ( !str.equals("") ) answer += str;
        
        return answer;
    }
}