import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 본인 여분 처리: lost와 reserve 둘 다에 있는 원소를 제거
        List<Integer> lostList = Arrays.stream(lost).boxed().collect(Collectors.toList());
        List<Integer> reserveList = Arrays.stream(reserve).boxed().collect(Collectors.toList());
        
        lostList.removeIf(item -> reserveList.remove(item)); // 본인이 여분을 가져왔지만 잃어버린 경우 제거

        for (int l : lostList) {
            if (reserveList.contains(l - 1)) {
                answer++;
                reserveList.remove(Integer.valueOf(l - 1));
            } else if (reserveList.contains(l + 1)) {
                answer++;
                reserveList.remove(Integer.valueOf(l + 1));
            }
        }
        
        answer += (n - lostList.size());
        return answer;
    }
}
