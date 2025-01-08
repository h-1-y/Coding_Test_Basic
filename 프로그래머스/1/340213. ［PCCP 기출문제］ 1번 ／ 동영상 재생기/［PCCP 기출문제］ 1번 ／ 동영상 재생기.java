class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        
        String target = openingCheck(pos, op_start, op_end);
		
		for ( String command : commands ) 
			target = command.equals("next") ? nextBtn(target, op_start, op_end, video_len) : prevBtn(target, op_start, op_end);
        
        return target;
    }
    
    public String nextBtn(String target, String op_start, String op_end, String video_len) {
		
		String result = "";
		
		String [] hhmm = target.split(":");
		int hh = Integer.parseInt(hhmm[0]);
		int mm = Integer.parseInt(hhmm[1]);
		
		mm += 10;
		
		if ( mm > 60 ) {
			hh++;
			mm = mm - 60;
		}
		
		result = timeStringAdd(hh+"") + ":" + timeStringAdd(mm+"");
		result = endTimeCheck(result, video_len);
		result = openingCheck(result, op_start, op_end);
		
		return result;
		
	}

	public String prevBtn(String target, String op_start, String op_end) {
		
		String result = "";
		
		String [] hhmm = target.split(":");
		int hh = Integer.parseInt(hhmm[0]);
		int mm = Integer.parseInt(hhmm[1]);
		
		mm -= 10;
		
		if ( hh > 0 ) {
			if ( mm < 0 ) {
				hh--;
				mm = 60 + mm;
			}
		} else {
			if ( mm < 0 ) mm = 0;
		}
		
		result = timeStringAdd(hh+"") + ":" + timeStringAdd(mm+"");
		result = openingCheck(result, op_start, op_end);
		
		return result;
		
	}
	
	public String openingCheck(String target, String op_start, String op_end) {
		
		int targetInt = Integer.parseInt(target.replace(":", ""));
		int openingStartInt = Integer.parseInt(op_start.replace(":", ""));
		int openingEndInt = Integer.parseInt(op_end.replace(":", ""));
		
		return (targetInt >= openingStartInt && targetInt <= openingEndInt) ? op_end : target;
		
	}
	
	public String endTimeCheck(String target, String video_len) {
		
		int targetInt = Integer.parseInt(target.replace(":", ""));
		int videoLenInt = Integer.parseInt(video_len.replace(":", ""));
		
		return targetInt < videoLenInt ? target : video_len;
		
	}
	
	public String timeStringAdd(String time) {
		return time.length() > 1 ? time : "0" + time;
	}
    
}