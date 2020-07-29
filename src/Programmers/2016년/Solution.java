class Solution {
    public String solution(int a, int b) {
        String answer = "";

        String[] dow = {"THU","FRI","SAT","SUN","MON","TUE","WED"};

        int days = 0;

        days = (a/2) * 31 + b;

        if(a>2){
            days += 29;
            days += (a-3)/2 * 30;
        }

        if(a>8){
            int plus = a%2;
            days += plus;
        }

        answer = dow[days%7];

        return answer;
    }
}
