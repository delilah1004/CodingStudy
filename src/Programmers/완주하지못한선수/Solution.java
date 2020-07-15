package Programmers.완주하지못한선수;

import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        String answer = "";

        for(int i=0; i<completion.length; i++){
            if(map.containsKey(completion[i])){
                map.put(completion[i], map.get(completion[i])+1);
            } else {
                map.put(completion[i],1);
            }
        }
        
        for(String person : participant){
            if(map.get(person)==null || map.get(person)==0){
                answer = person;
                return answer;
            }
            map.put(person, map.get(person)-1);
        }
        return answer;
    }
}
