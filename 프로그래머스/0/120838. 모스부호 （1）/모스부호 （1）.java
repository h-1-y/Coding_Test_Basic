class Solution {
    public String solution(String letter) {
        String answer = "";
        
        for ( String s : letter.split(" ") )
            answer += morse(s);
        
        return answer;
    }
    
    public String morse(String str) {
        
        String rtn_str = "";
        
        switch(str) {
        
	        case ".-" : rtn_str = "a"; break;
	    	case "-..." : rtn_str = "b"; break;
	    	case "-.-." : rtn_str = "c"; break;
	    	case "-.." : rtn_str = "d"; break;
	    	case "." : rtn_str = "e"; break;
	    	case "..-." : rtn_str = "f"; break;
	    	case "--." : rtn_str = "g"; break;
	    	case "...." : rtn_str = "h"; break;
	    	case ".." : rtn_str = "i"; break;
	    	case ".---" : rtn_str = "j"; break;
	    	case "-.-" : rtn_str = "k"; break;
	    	case ".-.." : rtn_str = "l"; break;
	    	case "--" : rtn_str = "m"; break;
	    	case "-." : rtn_str = "n"; break;
	    	case "---" : rtn_str = "o"; break;
	    	case ".--." : rtn_str = "p"; break;
	    	case "--.-" : rtn_str = "q"; break;
	    	case ".-." : rtn_str = "r"; break;
	    	case "..." : rtn_str = "s"; break;
	    	case "-" : rtn_str = "t"; break;
	    	case "..-" : rtn_str = "u"; break;
	    	case "...-" : rtn_str = "v"; break;
	    	case ".--" : rtn_str = "w"; break;
	    	case "-..-" : rtn_str = "x"; break;
	    	case "-.--" : rtn_str = "y"; break;
	    	case "--.." : rtn_str = "z"; break;
        	        
        }
        
        return rtn_str;
        
    }
    
}