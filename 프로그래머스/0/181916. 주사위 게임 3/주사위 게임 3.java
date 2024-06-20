import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int [] arr = {a,b,c,d};
		Arrays.sort(arr);
		
		a = arr[0];
		b = arr[1];
		c = arr[2];
		d = arr[3];
		
		if ( a == d ) answer = 1111*a;
		else if ( a == c ) answer = (10 * a + d) * (10 * a + d);
		else if ( b == d ) answer = (10 * b + a) * (10 * b + a);
		else if ( a == b && c == d ) answer = (a + c) * (c - a);
		else if ( a == b ) answer = c * d;
		else if ( b == c ) answer = a * d;
		else if ( c == d ) answer = a * b;
		else answer = a;
        
        return answer;
    }
}