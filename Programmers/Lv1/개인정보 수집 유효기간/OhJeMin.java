import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termsMap = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();
        int[] arr= {};
        for(int i=0;i<terms.length;i++){
            String[] input = terms[i].split(" ");
            termsMap.put(input[0],Integer.parseInt(input[1]));
        }
        for(int i=0;i<privacies.length;i++){
            String[] privTerms = privacies[i].split(" ");
            if(getDate(today) >= (getDate(privTerms[0])+termsMap.get(privTerms[1])*28)){
                answer.add(i+1);
            }
        }
        System.out.println(answer);
        /*
        for(int i = 0;i<answer.size();i++){
          int[] arr = new int[answer.size()];
          arr[i] = answer.get(i);
          }
        */
        return answer.stream().mapToInt(i->i).toArray();
    }
    private int getDate(String d){
        String[] date = d.split("\\.");
        return (Integer.parseInt(date[0])*12*28)+Integer.parseInt(date[1])*28+Integer.parseInt(date[2]);
    }
}
