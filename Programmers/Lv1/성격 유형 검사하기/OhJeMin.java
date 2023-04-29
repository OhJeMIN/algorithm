import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<survey.length;i++){
            map.put(survey[i].charAt(0),0);
            map.put(survey[i].charAt(1),0);
        }
        String[] survyChoice = new String[7];
        String[] MBTI = {"RT", "CF", "JM", "AN"};
        int index = 0;
        for(String sr : survey){
            for(int i=0;i<7;i++){
                if(i==3) continue;
                else{
                    if(i<3) survyChoice[i] = sr+(3-i);
                    else survyChoice[i] = sr+(i-3);
                }                
            }
            int choiceNum = choices[index];            
            String point = survyChoice[choiceNum-1];
            if(choiceNum-1 > 3) map.put(point.charAt(1), map.getOrDefault(point.charAt(1), 0) + point.charAt(2)-'0');
            else if(choiceNum-1 < 3) map.put(point.charAt(0),map.getOrDefault(point.charAt(0), 0) + point.charAt(2)-'0');           
            index++;
        }
        for(int i=0;i<4;i++){
            char front = MBTI[i].charAt(0);
            char back = MBTI[i].charAt(1);
            if(map.containsKey(front) && map.containsKey(back)){
               if(map.get(front) - map.get(back) > 0) answer += (front+"");
                else if(map.get(front) - map.get(back) < 0) answer += (back+"");
                else {
                    if(back - front > 0) answer += (front+"");
                    else answer += (back+"");
                } 
            }
            else{
                if(back - front > 0) answer += (front+"");
                else answer += (back+"");
            }            
        }        
        return answer;
    }
}
