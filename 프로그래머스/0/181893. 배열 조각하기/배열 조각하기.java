import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[] query) {

         List<Integer> listArr = new ArrayList<>(); //쉽게 삭제하기 위해


           for (int value : arr) {
            listArr.add(value); 
        }

        for(int i=0;i<query.length;i++){
            int len = listArr.size();
            if(i%2==0){  //query[i] 가 아니라, i로 짝,홀 판단하고 자를 때는 query[i]기준

                listArr = listArr.subList(0,query[i]+1);


            }else{
                listArr = listArr.subList(query[i],len);

            }


        }

         int[] answer = new int[listArr.size()];
        for (int i = 0; i < listArr.size(); i++) {
            answer[i] = listArr.get(i); 
        }

        return answer;
    }

}