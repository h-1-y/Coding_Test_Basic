class Solution {
    public int[] solution(int[] numbers, String direction) {
        int [] answer = new int[numbers.length];
		
		for ( int i=0; i<answer.length; i++ ) {
			
			if ( direction.equals("left") ) 
                answer[i] = numbers[i >= (numbers.length-1) ? 0 : i+1];
			else 
                answer[i] = numbers[i == 0 ? (numbers.length-1) : i-1];
			
		}
        
        return answer;
    }
}