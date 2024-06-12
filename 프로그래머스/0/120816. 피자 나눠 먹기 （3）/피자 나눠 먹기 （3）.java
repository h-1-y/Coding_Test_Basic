class Solution {
    public int solution(int slice, int n) {
        return ((n/slice) * slice < n ? (n/slice)+1 : (n/slice));
    }
}