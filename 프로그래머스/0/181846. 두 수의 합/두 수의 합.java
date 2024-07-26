import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        
        BigInteger bi = new BigInteger(a);
		BigInteger bi2 = new BigInteger(b);
		BigInteger sum = bi.add(bi2);
        
        return sum + "";
    }
}