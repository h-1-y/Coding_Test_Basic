class Solution {
    public int[] solution(String s) {
        
        int[] answer = new int[s.length()];
		
		for ( int i=0; i<s.length(); i++ ) {
			int target = s.substring(0, i).lastIndexOf(s.charAt(i));
			answer[i] = target == -1 ? target : i-target;
		}
        
        return answer;
    }
}