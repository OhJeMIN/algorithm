import java.util.*;
class Solution {
    public String solution(String new_id) {
        String answer = "";
        Deque<String> dq = new ArrayDeque<>();
        Deque<String> storage = new ArrayDeque<>();
        //1단계
        String LoweredNewId = new_id.toLowerCase();
        String[] input = LoweredNewId.split("");
        //2단계
        for(int i =0;i<LoweredNewId.length();i++){
            if(Character.isLetterOrDigit(LoweredNewId.charAt(i))) dq.add(input[i]);
            else{
                if(LoweredNewId.charAt(i) == '-' ||
                   LoweredNewId.charAt(i) == '_' ||
                   LoweredNewId.charAt(i) == '.' ) dq.add(input[i]);
            }
        }
        int size = dq.size();
        //3단계
        for(int i=0;i<size;i++){
            String poppedString = dq.poll();
            if(!storage.isEmpty() && storage.peekLast().equals(".") && poppedString.equals(".")) 
                continue;
            else storage.add(poppedString);            
        }
        //4단계
        if(!storage.isEmpty()) if(storage.peekLast().equals(".")) storage.pollLast();
        if(!storage.isEmpty()) if(storage.peekFirst().equals(".")) storage.pollFirst();
        //5단계
        if(storage.isEmpty()) storage.add("a");
        int sized = storage.size();
        //6단계
        if(storage.size() >= 16) {
            for(int i =0;i<sized - 15;i++){
                storage.pollLast();
            }
        }
        if(!storage.isEmpty()) if(storage.peekLast().equals(".")) storage.pollLast();
        if(!storage.isEmpty()) if(storage.peekFirst().equals(".")) storage.pollFirst();
        //7단계
        if(storage.size() <=2){
            while(storage.size()<3){
                storage.add(storage.peekLast());
            }
        }
        for(String s : storage) answer+=s;
        return answer;
    }
}
