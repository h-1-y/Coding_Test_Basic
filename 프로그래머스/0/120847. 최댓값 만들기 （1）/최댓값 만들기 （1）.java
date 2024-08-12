import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        int[] maxArr = new int[(numbers.length-1) * numbers.length];
		int idx = 0;
		
		for ( int i=0; i<numbers.length; i++ ) 
			for ( int j=0; j<numbers.length; j++ ) 
				if ( i != j ) maxArr[idx++] = numbers[i] * numbers[j];
        
        return Arrays.stream(maxArr).max().getAsInt();
    }
}