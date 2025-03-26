import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] math1 = { 1, 2, 3, 4, 5 };
		int[] math2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] math3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		
		int idx1 = 0;
		int cnt1 = 0;
		int idx2 = 0;
		int cnt2 = 0;
		int idx3 = 0;
		int cnt3 = 0;
		
		for ( int i : answers ) {
			
			if ( idx1 == math1.length ) idx1 = 0;
			if ( idx2 == math2.length ) idx2 = 0;
			if ( idx3 == math3.length ) idx3 = 0;
			
			if ( i == math1[idx1++] ) cnt1++;
			if ( i == math2[idx2++] ) cnt2++;
			if ( i == math3[idx3++] ) cnt3++;
			
		}
		
		int max = Collections.max(new ArrayList<>(Arrays.asList(cnt1, cnt2, cnt3)));
		List<Integer> list = new ArrayList<>();
		
		if ( max == cnt1 ) list.add(1);
		if ( max == cnt2 ) list.add(2);
		if ( max == cnt3 ) list.add(3);
		
		int[] answer = new int[list.size()];
		for ( int i=0; i<answer.length; i++ ) answer[i] = list.get(i);
        
        return answer;
    }
}