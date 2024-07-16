import java.util.*;

class Solution {
    public String[] solution(String my_string) {
       
        List<String> list = new ArrayList<>();
		String target = "";
		
		for ( String str : my_string.split("") ) {
			
			if ( !str.equals(" ") ) target += str;
			else {
				if ( !target.equals("") ) list.add(target);
				target = "";
				continue;
			}
			
		}
		
		if ( !target.equals("") ) list.add(target);
        
        return list.toArray(String[]::new);
    }
}