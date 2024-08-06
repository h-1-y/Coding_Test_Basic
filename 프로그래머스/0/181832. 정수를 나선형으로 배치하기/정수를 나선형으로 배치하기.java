class Solution {
    public int[][] solution(int n) {
        
        int [][] answer = new int[n][n];
		
		int first = 0;
		int second = 0;
		
		int val = 1;
		
		while ( val <= (n*n) ) {
			
			answer[first][second] = val++;
			
			if ( second < n-1 && (first == 0 || answer[first - 1][second] != 0) && answer[first][second + 1] == 0 ) { // 오른쪽 
				second++;
			} else if ( first < n-1 && second != 0 && answer[first + 1][second] == 0 ) { // 아래 
				first++;
			} else if ( first <= n-1 && second != 0 && answer[first][second - 1] == 0 ) { // 왼쪽 
				second--;
			} else if ( first > 0 && answer[first - 1][second] == 0 ) { // 위
				first--;
			}
			
		}
        
        return answer;
    }
}