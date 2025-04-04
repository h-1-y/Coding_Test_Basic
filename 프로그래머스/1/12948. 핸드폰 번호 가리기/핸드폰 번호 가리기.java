class Solution {
    public String solution(String phone_number) {
        
        int starLen = phone_number.substring(0, phone_number.length() - 4).length();
		String phone = phone_number.substring(phone_number.length() - 4, phone_number.length());
		String answer = "*".repeat(starLen) + phone;
        
        return answer;
        
    }
}