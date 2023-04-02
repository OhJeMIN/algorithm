import java.util.*;
class Solution {
    //ArrayList 이용
    // 1 : 빵, 2 : 야채, 3 : 고기 -> 1231
    // 4개의 합 X, 1231 순서대로
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<ingredient.length;i++){
            list.add(ingredient[i]);
            if(list.size()>=4){
                if(list.get(list.size()-4) == 1
                   && list.get(list.size()-3) == 2
                   && list.get(list.size()-2) == 3
                   && list.get(list.size()-1) == 1){
                    answer ++;
                    list.remove(list.size()-4);
                    list.remove(list.size()-3);
                    list.remove(list.size()-2);
                    list.remove(list.size()-1);
                }
            }
        }        
        return answer;
        /* 
        다른 사람 풀이
        배열에서 지우는것이 아닌 배열 위치를 -4를 해서 값을 바꿔줌
        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack[sp++] = i;
            System.out.println(Arrays.toString(stack));
            if (sp >= 4 && stack[sp - 1] == 1
                && stack[sp - 2] == 3
                && stack[sp - 3] == 2
                && stack[sp - 4] == 1) {
                sp -= 4;
                answer++;
            }
        }
        return answer;
        */
    }
}
