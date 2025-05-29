class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
		
		for ( int i=0; i<n; i++ ) {
			
			String resultStr = "";
			String str = Integer.toBinaryString(arr1[i]);
			String str2 = Integer.toBinaryString(arr2[i]);
			int len = str.length();
			int len2 = str2.length();
			
			if ( len < n ) str = "0".repeat(n-len) + str;
			if ( len2 < n ) str2 = "0".repeat(n-len2) + str2;
			
			for ( int j=0; j<n; j++ ) {
				if ( str.charAt(j) == '1' || str2.charAt(j) == '1' ) resultStr += "#";
				else resultStr += " ";
			}
			
			answer[i] = resultStr;
			
		}
        
        return answer;
        
    }
}