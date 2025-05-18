import java.util.*;

class Solution {
    public long solution(long n) {
        
        String[] arr = (n+"").split("");
		
		Arrays.sort(arr, Collections.reverseOrder());
		String str = String.join("", arr);
        
        return Long.parseLong(str);
        
    }
}