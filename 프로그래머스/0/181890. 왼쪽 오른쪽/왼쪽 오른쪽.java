import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        
        String lr = "";
		int idx = 0;
		List<String> list = new ArrayList<>();
		
		for ( int i=0; i<str_list.length; i++ )
			if ( str_list[i].equals("l") || str_list[i].equals("r") ) {
				lr = str_list[i];
				idx = i;
				break;
			}
		
		for (int i=(lr.equals("l") ? 0 : idx+1); i<(lr.equals("l") ? idx : str_list.length); i++) 
			list.add(str_list[i]);
        
        return list.toArray(new String[list.size()]);
    }
}