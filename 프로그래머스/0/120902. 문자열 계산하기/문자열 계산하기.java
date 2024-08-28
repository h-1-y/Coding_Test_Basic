class Solution {
    public int solution(String my_string) {
        
        String [] arr = my_string.split(" ");
        
        int answer = 0;
		boolean plusMinus = true;
		
		for ( int i=0; i<arr.length; i++ ) 
			if ( i%2 == 0 ) answer = plusMinus ? answer + Integer.parseInt(arr[i]) : answer - Integer.parseInt(arr[i]);
			else plusMinus = arr[i].equals("+") ? true : false;
        
        return answer;
    }
}