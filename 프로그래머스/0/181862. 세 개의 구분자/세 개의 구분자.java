import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        
        List<String> list = new ArrayList<>();
		String addStr = "";
		
		for ( String str : myStr.split("") ) {
			
			if ( str.equals("a") || str.equals("b") || str.equals("c") ) {
				if ( !addStr.equals("") ) {
					list.add(addStr);
					addStr = "";
				}
			} else addStr += str;
			
		}
		
		if ( !addStr.equals("") ) list.add(addStr);
        if ( list.size() == 0 ) list.add("EMPTY");
        
        return list.toArray(String[]::new);
    }
}