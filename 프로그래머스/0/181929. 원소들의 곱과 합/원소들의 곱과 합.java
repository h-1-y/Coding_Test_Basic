class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int mul = 1;
        int add = 0;
        
        for ( int i : num_list ) {
            mul *= i;
            add += i;
        }
        
        add = add * add;
        
        return mul > add ? 0 : 1;
    }
}