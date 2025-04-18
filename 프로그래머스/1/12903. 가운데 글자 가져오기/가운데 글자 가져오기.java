class Solution {
    public String solution(String s) {
        
        int idx = s.length() / 2;
		boolean b = s.length()%2 == 0 ? true : false;
        
        return s.substring(b ? idx-1 : idx, idx+1);
        
    }
}