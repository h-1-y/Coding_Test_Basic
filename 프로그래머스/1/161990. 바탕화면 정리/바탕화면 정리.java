class Solution {
    public int[] solution(String[] wallpaper) {
        
        int [] answer = new int[4];
		
		int lux = 0;
		int luy = wallpaper[0].length();
		int rdx = 0;
		int rdy = 0;
		
		for ( int i=wallpaper.length-1; i>=0; i-- ) {
			
			lux = wallpaper[i].contains("#") ? i : lux;
			rdx = rdx == 0 ? (wallpaper[i].contains("#") ? i+1 : rdx) : rdx;
			
			if ( wallpaper[i].indexOf("#") != -1 ) {
				luy = luy > wallpaper[i].indexOf("#") ? wallpaper[i].indexOf("#") : luy;
				rdy = rdy < wallpaper[i].lastIndexOf("#") + 1 ? wallpaper[i].lastIndexOf("#") + 1 : rdy;
			}
			
		}
		
		answer[0] = lux;
		answer[1] = luy;
		answer[2] = rdx;
		answer[3] = rdy;
        
        return answer;
    }
}