class Solution {
    public int solution(int chicken) {
        
        int service = 0;
		int coupon = 0;
		
		while ( chicken >= 10 ) {
			
			service += chicken/10;
			coupon += chicken%10;
			chicken /= 10;
			
		}
		
		int etc = coupon + chicken;
		
		while ( etc >= 10 ) {
			
			service += etc/10;
			etc = (etc/10 + etc%10);
			
		}
        
        return service;
    }
}