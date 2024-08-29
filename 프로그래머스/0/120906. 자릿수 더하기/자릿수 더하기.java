class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for ( String str : (n+"").split("") ) answer += Integer.parseInt(str);
        
        return answer;
    }
}