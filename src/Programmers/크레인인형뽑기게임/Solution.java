package Programmers.크레인인형뽑기게임;

import java.util.Stack;

public class Solution {
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> result = new Stack<Integer>();
        
        for(int m : moves){
            int pick = m-1;
            int doll = 0;
            
            for(int i=0; i<board.length; i++){
                if(board[i][pick]!=0){
                    
                    answer++;
                    
                    doll = board[i][pick];
                    board[i][pick] = 0;
                    
                    if(result.empty() || result.peek() != doll){
                        result.push(doll);
                        break;
                    } 
                    if (result.peek() == doll){
                        result.pop();
                        break;
                    }
                }
            }          
        }
        
        answer -= result.size();
        
        return answer;
    }
}
