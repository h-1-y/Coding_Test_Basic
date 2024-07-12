class Solution {
    public int solution(int[] num_list) {
        
        int sum = num_list.length > 10 ? 0 : 1;
		
		if ( num_list.length > 10 ) for ( int i : num_list ) sum += i;
		else for ( int i : num_list ) sum *= i;
        
        return sum;
    }
}