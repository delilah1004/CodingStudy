function solution(participant, completion) {
    var answer = '';

    for(var p in participant){
        let person = participant[p];
        let index = completion.indexOf(person);

        if(index == -1){
            answer = person;
            break;
        }
        if(index instanceof Array){
            index = index[0]
        }
        completion.splice(index, 1);
    }
    return answer;
}
