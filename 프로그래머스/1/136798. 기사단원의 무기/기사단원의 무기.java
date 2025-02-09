class Solution {
    public int solution(int number, int limit, int power) {
        
        int answer = 0;
		int weaponPoint = 0;
		
		for ( int i=1; i<=number; i++ ) {
			
			for ( int j=1; j*j<=i; j++ ) { 
				if ( j*j == i ) weaponPoint++;
				else if ( i%j == 0 ) weaponPoint+=2;
			}
			
			if ( weaponPoint > limit ) weaponPoint = power;
			
			answer += weaponPoint;
			weaponPoint = 0;
			
		}
        
        return answer;
    }
}