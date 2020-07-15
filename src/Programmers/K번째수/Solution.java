package Programmers.K번째수;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int start = commands[i][0]-1;
            int end = commands[i][1];
            int pick = commands[i][2]-1;

            int length = end-start;

            int[] result = new int[length];
            for(int j=0; j<length; j++){
                result[j] = array[start+j];
            }

            for(int n=result.length-1; n>0; n--){
                for(int k=0; k<n; k++){
                    int first = result[k];
                    int second = result[k+1];
                    int temp = 0;

                    if(first>second){
                        temp = second;
                        result[k+1] = first;
                        result[k] = temp;
                    }
                }
            }
            answer[i] = result[pick];
        }
        return answer;
    }
}
