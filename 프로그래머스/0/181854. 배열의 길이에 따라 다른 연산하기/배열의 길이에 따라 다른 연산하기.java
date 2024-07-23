class Solution {
    public int[] solution(int[] arr, int n) {
        
        for ( int i=0; i<arr.length; i++ ) 
			arr[i] = arr.length%2 == 0 ? (i%2 == 1 ? arr[i] = arr[i] + n : arr[i]) : (i%2 == 0 ? arr[i] = arr[i] + n : arr[i]);
        
        return arr;
    }
}