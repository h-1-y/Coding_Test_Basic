import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        
        int[] answer = new int[score.length]; 
		int day = 0;
		
		while( day < score.length ) {
			
			day++;
			Integer[] arr = new Integer[day];
			
			for ( int i=0; i<day; i++ ) arr[i] = score[i];
			
			Arrays.sort(arr, Collections.reverseOrder());
			answer[day-1] = arr[arr.length-1 < k-1 ? arr.length-1 : k-1];
			
		}
        
        return answer;
    }
}