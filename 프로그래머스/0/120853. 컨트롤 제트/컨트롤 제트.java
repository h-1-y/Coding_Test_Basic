class Solution {
    public int solution(String s) {
        int answer = 0;
        String [] arr = s.split(" ");
		
		for ( int i=0; i<arr.length; i++ ) 
			answer = !arr[i].equals("Z") ? answer + Integer.parseInt(arr[i]) : answer - Integer.parseInt(arr[i-1]);
        
        return answer;
    }
}