import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        
        Arrays.sort(array);
        List<Integer> list = new ArrayList<>();
		
		for ( int i=0; i<array.length; i++ )
			list.add(n > array[i] ? (n - array[i]) : (array[i] - n));
        
        int idx = list.indexOf(list.stream().mapToInt(i -> i).min().orElse(0));
        
        return array[idx];
        
    }
}