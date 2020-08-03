function solution(board, moves) {
    /* answer : 뽑은 인형의 개수 */
    var answer = 0;

    /* result : 뽑힌 인형이 담기는 Stack */
    const result = [];

    /* moves.length : 인형 뽑기 횟수 */
    for(var m in moves) {
        /* pick : 집게가 위치한 열 번호 */
        var pick = moves[m]-1;
        var doll = 0;

        for(var i = 0 ; i < board.length; i++){
            if(board[i][pick] != 0){
                /* 뽑은 인형 수 ++ */
                answer++;

                /* doll : 현재 뽑은 인형 번호 */
                doll = board[i][pick];
                /* 뽑힌 인형 자리 0 */
                board[i][pick] = 0;

                /* 남은 인형이 없거나 가장 위의 인형이 지금 뽑은 인형이 아니면 push */
                if(result.length === 0 || result[result.length-1] !== doll){
                    result.push(doll);
                    break;
                }
                /* 가장 위의 인형이 지금 뽑은 인형과 같으면 pop */
                if (result[result.length-1] === doll){
                    result.pop();
                    break;
                }
            } 
        }
    }
    answer -= result.length;
    return answer;
}
