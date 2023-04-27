import java.util.*;

class Solution {
    public int[] solution(int[] answers) {        
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] cnt = new int[3]; 
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == one[i%5])
                cnt[0]++;
            if(answers[i] == two[i%8])
                cnt[1]++;
            if(answers[i] == three[i%10])
                cnt[2]++;
        }

        int max = Math.max(Math.max(cnt[0], cnt[1]), cnt[2]);
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 3; i++) {
            if(max == cnt[i]) {
                list.add(i+1); 
            }
        }
        
        int[] answer = new int[list.size()]; 
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}