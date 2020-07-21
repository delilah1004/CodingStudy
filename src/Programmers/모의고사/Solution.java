import java.util.Vector;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        Vector<Integer> vector = new Vector<Integer>();

        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        int a = 0, b = 0, c = 0;

        for(int i=0; i<answers.length; i++){
            if(one[i%one.length]==answers[i]) a++;
            if(two[i%two.length]==answers[i]) b++;
            if(three[i%three.length]==answers[i]) c++;
        }

        for(int j=answers.length; j>=0; j--){
            if(a==j) vector.add(1);
            if(b==j) vector.add(2);
            if(c==j) vector.add(3);

            if(vector.size()!=0) break;
        }

        answer = new int[vector.size()];

        for(int k=0; k<vector.size(); k++){
            answer[k] = vector.get(k);
        }

        return answer;
    }
}
