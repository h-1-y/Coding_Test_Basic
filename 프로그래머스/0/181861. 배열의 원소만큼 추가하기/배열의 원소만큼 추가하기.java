import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int sum = 0;
		int cnt = 0;
		for ( int i : arr ) sum += i;
		
		int [] answer = new int[sum];
		
		for ( int i=0; i<arr.length; i++ ) 
			for ( int j=0; j<arr[i]; j++ ) answer[cnt++] = arr[i];
        
		return answer;
        
    }
}