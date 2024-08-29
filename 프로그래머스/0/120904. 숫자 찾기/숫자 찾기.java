class Solution {
    public int solution(int num, int k) {
        
        String str = num+"";
        int answer = str.indexOf(k+"");
        
        return answer == -1 ? -1 : answer + 1;
    }
}