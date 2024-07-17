import java.util.*;

class Solution {
    public String[] solution(String myString) {
        
        List<String> list = new ArrayList<>(); 
		list.addAll(Arrays.asList(myString.split("x")));
        
        list.removeAll(Arrays.asList(""));
		
		Collections.sort(list);
        
        return list.toArray(String[]::new);
    }
}