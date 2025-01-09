import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        
        int answer = 0;
        
        Arrays.sort(wallet);
		Arrays.sort(bill);
        
        int bill_a = bill[0];
		int bill_b = bill[1];
        int target = 0;
		
		while( true ) {
			
			if ( bill_a > wallet[0] || bill_b > wallet[1] ) {
				
				if ( (bill_b/2) > bill_a ) {
					bill_b = bill_b/2;
				} else {
					target = bill_a;
					bill_a = bill_b/2;
					bill_b = target;
				}
				
				answer++;
				
			} else break;
			
		}
        
        return answer;
        
    }
}