class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int [] num_list = new int[included.length];
        
        for ( int i=0; i<num_list.length; i++ ) {
            num_list[i] = i == 0 ? a : num_list[i-1] + d;
            if ( included[i] ) answer += num_list[i];
        }
            
        return answer;
    }
}