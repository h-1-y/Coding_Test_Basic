class Solution {
    public int solution(int num, int k) {
        
        int answer = -1;
		String [] arr = (num+"").split("");
		
		for ( int i=0; i<arr.length; i++ ) 
			if ( arr[i].equals(k+"") ) {
				answer = i+1;
				break;
			}
        
        return answer;
    }
}