class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int big = sides[0] > sides[1] ? sides[0] : sides[1];
		int small = sides[0] < sides[1] ? sides[0] : sides[1];
		int sum = (big + small) -1;
		int n1 = big - small;
		int n2 = big;
		
		while ( n1 < big ) {
			n1++;
			answer++;
		}
		
		while( sum > n2 ) {
			n2++;
			answer++;
		}
        
        return answer;
    }
}