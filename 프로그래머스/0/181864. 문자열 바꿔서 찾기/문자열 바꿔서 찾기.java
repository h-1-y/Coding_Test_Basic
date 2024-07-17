class Solution {
    public int solution(String myString, String pat) {
        
        pat = pat.replace("A", "C").replace("B", "A").replace("C", "B");
        
        return myString.contains(pat) ? 1 : 0;
    }
}