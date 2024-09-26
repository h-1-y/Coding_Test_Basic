class Solution {
    public int solution(int[] common) {
        
        int answer = (common[common.length-2]+1 == common[common.length-1]) ? common[common.length-1] + 1 : common[common.length-1] * 2;
        
        return answer;
    }
}