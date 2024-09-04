class Solution {
    public int solution(int[][] board) {
        int answer = 0;
            
        for ( int i=0; i<board.length; i++ ) {
			for ( int j=0; j<board[i].length; j++ ) {
				
				int pre_y = (i == 0 ? i : i-1);
				int next_y = (i == (board.length-1) ? i : i+1);
				int pre_x = (j == 0 ? j : j-1);
				int next_x = (j == (board[i].length-1) ? j : j+1);
				
				if ( 
						board[i][j] != 1 && 
						board[pre_y][pre_x] != 1 &&
						board[pre_y][j] != 1 &&
						board[pre_y][next_x] != 1 &&
						board[i][pre_x] != 1 &&
						board[i][next_x] != 1 &&
						board[next_y][pre_x] != 1 &&
						board[next_y][j] != 1 &&
						board[next_y][next_x] != 1
				   ) answer++;
					
			}
		}
            
        return answer;
    }
}