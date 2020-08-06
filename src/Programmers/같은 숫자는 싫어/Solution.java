import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<Integer>();

        for(int i : arr){
            if(stack.size()==0 || stack.peek()!=i) {
                stack.push(i);
            }
        }

        int[] answer = new int[stack.size()];

        for(int j=answer.length-1; j>=0; j--){
            answer[j] = stack.pop();
        }

        return answer;
    }
}
