import java.util.*;

class Solution {
    public int solution(String dartResult) {
        
        int answer = 0;
		List<String> dartList = new ArrayList<>();
		List<Integer> pointList = new ArrayList<>();
		String str = "";
		
		for ( int i=0; i<dartResult.length(); i++ ) {
			if ( dartResult.charAt(i) != '*' && dartResult.charAt(i) != '#' ) {
				if ( dartResult.charAt(i) != 'S' && dartResult.charAt(i) != 'D' && dartResult.charAt(i) != 'T' )
					str += dartResult.charAt(i);
				else {
					str += dartResult.charAt(i);
					dartList.add(str);
					str = "";
				}
			} else {
				dartList.add(dartResult.charAt(i)+"");
				str = "";
			}
		}
		
		for ( int i=0; i<dartList.size(); i++ ) {
			
			String s = dartList.get(i);
			int len = dartList.get(i).length();
			
			if ( len > 1 ) {
				
				int point = Integer.parseInt(s.substring(0, len-1));
				String area = s.substring(len-1);
				
				if ( area.equals("D") ) pointList.add(point * point);
				else if ( area.equals("T") ) pointList.add(point * point * point);
				else pointList.add(point);
				
			} else {
				
				if ( s.equals("*") ) {
					int size = (pointList.size()-2) < 0 ? 0 : pointList.size()-2;
					for ( int j=size; j<pointList.size(); j++ ) 
                        pointList.set(j, pointList.get(j)*2);
				} else {
                    int size = pointList.size()-1;
					pointList.set(size, pointList.get(size) * -1);
                }
				
			}
			
		}
		
		for ( int i : pointList ) answer += i;
        
        return answer;
    }
}