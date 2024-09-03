class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int [] answer = new int[2];
		int xMax = board[0]/2;
		int xMin = -(board[0]/2);
		int yMax = board[1]/2;
		int yMin = -(board[1]/2);
		
		for ( String key : keyinput ) {
			
			if ( key.equals("left") && answer[0] <= xMax && answer[0] > xMin ) answer[0] = answer[0] - 1;
			else if ( key.equals("right") && answer[0] < xMax && answer[0] >= xMin ) answer[0] = answer[0] + 1;
			else if ( key.equals("up") && answer[1] < yMax && answer[1] >= yMin ) answer[1] = answer[1] + 1;
			else if ( key.equals("down") && answer[1] <= yMax && answer[1] > yMin ) answer[1] = answer[1] - 1;
			
		}
        
        return answer;
    }
}