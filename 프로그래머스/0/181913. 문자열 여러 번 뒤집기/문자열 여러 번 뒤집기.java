class Solution {
    public String solution(String my_string, int[][] queries) {
        
        StringBuffer sb = new StringBuffer(my_string);
        
        for ( int i = 0; i<queries.length; i++ ) {
			my_string = "";
			for ( int j=queries[i][1]; j>=queries[i][0]; j-- ) {
				my_string += sb.charAt(j);
			}
			sb.replace(queries[i][0], queries[i][1]+1, my_string);
		}
        
        return sb.toString();
    }
}