class Solution {
    public int solution(int[] arr) {
        
        boolean loop = true;
		int chg_cnt = 0;
		int cnt = 0;
		
		while(loop) {
			
			loop = false;
			
			for ( int i=0; i<arr.length; i++ ) {
				
				if ( arr[i] >= 50 && arr[i]%2==0 ) arr[i] = arr[i]/2;
				else if ( arr[i] < 50 && arr[i]%2!=0 ) arr[i] = (arr[i]*2)+1;
				else continue;
				
				chg_cnt++;
				
			}
			
			if ( chg_cnt != 0 ) loop = true;
			chg_cnt = 0;
			cnt++;
			
		}
        
        return cnt-1;
    }
}