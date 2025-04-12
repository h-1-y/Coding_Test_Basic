class Solution {
    public boolean solution(int x) {
        
        String str = x+"";
		int sum = 0;
		
		for ( char c : str.toCharArray() ) 
			sum += Integer.parseInt(c+"");
        
        return x%sum == 0;
        
    }
}