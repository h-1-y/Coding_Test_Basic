class Solution {
    public int solution(int[] date1, int[] date2) {
        
        String strDate1 = "";
		String strDate2 = "";
		
		for ( int i=0; i<date1.length; i++ ) {
			strDate1 += (date1[i] + "");
			strDate2 += (date2[i] + "");
		}
        
        return Integer.parseInt(strDate1) < Integer.parseInt(strDate2) ? 1 : 0;
    }
}