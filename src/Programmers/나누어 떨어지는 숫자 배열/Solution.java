import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList array = new ArrayList();
        int count = 0;

        for(int i : arr){
            if(i%divisor==0) {
                count++;
                array.add(i);
            }
        }

        if(count>0){
            Collections.sort(array);
            answer = new int[count];
            for(int j=0; j<array.size(); j++){
                answer[j] = (int) array.get(j);
            }
        } else {
            answer = new int[]{-1};
        }

        return answer;
    }
}
