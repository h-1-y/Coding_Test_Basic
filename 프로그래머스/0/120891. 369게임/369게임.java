class Solution {
    public int solution(int order) {
        int answer = 0;
        
        for ( String str : (order+"").split("") )
			if ( str.equals("3") || str.equals("6") || str.equals("9") ) answer++;
        
        return answer;
    }
}