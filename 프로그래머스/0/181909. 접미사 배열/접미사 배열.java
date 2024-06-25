import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        
        int len = 0;
		String str = "";
        ArrayList<String> list = new ArrayList<>();
        
        for ( int i=0; i<my_string.length(); i++ ) {
			for ( int j=len; j<my_string.length(); j++ ) str += my_string.charAt(j);
			
			list.add(str);
			len++;
			str = "";
		}
        
        Collections.sort(list);
        
        return list.toArray(new String[list.size()]);
        
    }
}