class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        
        int seqCount = 0;
		int attackCount = 0;
		int timeCount = 0;
		int nowHealth = health;
		
		while ( attackCount < attacks.length ) {
			
			timeCount++;
			
			if ( timeCount != attacks[attackCount][0] ) {
				
				seqCount++;
				
				if ( seqCount < bandage[0] ) {
					nowHealth = (nowHealth + bandage[1]) > health ? health : (nowHealth + bandage[1]);
				} else {
					nowHealth = (nowHealth + (bandage[1]+bandage[2])) > health ? health : (nowHealth + bandage[1]+bandage[2]);
					seqCount = 0;
				}
				
			} else {
				
				nowHealth -= attacks[attackCount][1];
				attackCount++;
				seqCount = 0;
				
			}
			
			if ( nowHealth <= 0 ) return -1;
			
		}
        
        return nowHealth;
    }
}