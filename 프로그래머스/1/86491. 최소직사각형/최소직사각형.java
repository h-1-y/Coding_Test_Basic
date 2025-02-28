import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        
        int h = sizes[0][0] < sizes[0][1] ? sizes[0][0] : sizes[0][1];
		int w = sizes[0][0] > sizes[0][1] ? sizes[0][0] : sizes[0][1];
		
		for ( int[] arr : sizes ) {
			
			Arrays.sort(arr);
			
			h = h > arr[0] ? h : arr[0];
			w = w > arr[1] ? w : arr[1];
			
		}
        
        return w*h;
    }
}