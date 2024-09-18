class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for ( int a=i; a<=j; a++ )
            for ( String s : (a+"").split("") )
                if ( s.contains(k+"") ) answer++;
        
        return answer;
    }
}