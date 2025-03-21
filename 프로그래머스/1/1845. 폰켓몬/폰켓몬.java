import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
		int get = nums.length/2;
		
		for ( int i : nums ) {
			if ( map.get(i) == null ) map.put(i, 1);
			else map.put(i, map.get(i)+1);
		}
        
        return map.size() >= get ? get : map.size();
        
    }
}