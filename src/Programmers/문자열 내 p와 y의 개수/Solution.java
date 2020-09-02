class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int p=0, y=0;

        for (int i=0; i<s.length(); i++){
            String ch = String.valueOf(s.charAt(i));
            if(ch.equalsIgnoreCase("p")) p++;
            if(ch.equalsIgnoreCase("y")) y++;
        }
        
        if(p != y) answer = false;

        return answer;
    }
}
