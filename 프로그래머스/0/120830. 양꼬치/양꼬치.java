class Solution {
    public int solution(int n, int k) {
        
        k = (k - (n/10)) * 2000;
        n = n * 12000;
        
        return n + k;
    }
}