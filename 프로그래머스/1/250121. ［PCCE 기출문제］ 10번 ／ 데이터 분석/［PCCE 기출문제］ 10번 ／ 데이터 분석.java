import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        int where = 0;
		
		if ( ext.equals("code") ) where = 0;
		else if ( ext.equals("date") ) where = 1;
		else if ( ext.equals("maximum") ) where = 2;
		else if ( ext.equals("remain") ) where = 3;
		
		int count = 0;
		
		for ( int i=0; i<data.length; i++ ) 
			if ( data[i][where] < val_ext ) count++;
		
		int [][] answer = new int[count][3];
		count = 0;
		
		for ( int i=0; i<data.length; i++ ) 
			if ( data[i][where] < val_ext ) answer[count++] = data[i];
		
		Arrays.sort(answer, (o1, o2) -> {
			
			int sort = 0;
			
			if ( sort_by.equals("code") ) sort = 0;
			else if ( sort_by.equals("date") ) sort = 1;
			else if ( sort_by.equals("maximum") ) sort = 2;
			else if ( sort_by.equals("remain") ) sort = 3;
			
			return o1[sort] - o2[sort];
			
		});
        
        return answer;
    }
}