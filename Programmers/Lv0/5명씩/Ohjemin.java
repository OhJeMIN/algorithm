import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        Map<Integer,String[]> map = new HashMap<>();
        int idx = 0;
        int size = 5;
        for (int i = 0; i < names.length; i += size) {
            // 배열의 남은 요소가 size보다 작을 수 있으므로, 실제 복사할 길이 계산
            int length = Math.min(names.length - i, size);            
            String[] part = Arrays.copyOfRange(names, i, i + length);            
            map.put(idx++, part);
        }
        String[] answer = new String[idx];
        for (Map.Entry<Integer, String[]> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue()[0];
            answer[key] = value;
        }        
        return answer;
    }
}
