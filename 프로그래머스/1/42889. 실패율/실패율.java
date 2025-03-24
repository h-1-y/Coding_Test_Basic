import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        int[] answer = new int[N];
		Map<Integer, Integer> map = new HashMap<>();
		
		for ( int i : stages ) {
			if ( map.get(i) != null ) map.put(i, map.get(i)+1);
			else map.put(i, 1);
		}
		
		Map<Integer, Double> map2 = new HashMap<>();
		Double[] arr = new Double[N];
		
		for ( int i=1; i<=N; i++ ) {
			
			int sum = 0;
			
			for ( int j=i; j<=N+1; j++ ) if ( map.get(j) != null ) sum += map.get(j);
			
			double fail = map.get(i) == null ? 0.0 : (double) map.get(i)/sum;
			
			map2.put(i, fail);
			arr[i-1] = fail;
			
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		int idx = 0;
		
		for ( double d : arr ) {
			for ( int i=1; i<=N; i++ ) {
				if ( map2.get(i) == null ) continue;
				else if ( map2.get(i) == d ) {
					answer[idx++] = i;
					map2.remove(i);
					break;
				}
			}
		}
        
        return answer;
    }
}