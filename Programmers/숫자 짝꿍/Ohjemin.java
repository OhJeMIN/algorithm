import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String X, String Y) {
        Map<Character, Integer> mapX = new HashMap<>();
        Map<Character, Integer> mapY = new HashMap<>();
        for (char c : X.toCharArray()) {
            mapX.put(c, mapX.getOrDefault(c, 0) + 1);
        }        
        for (char c : Y.toCharArray()) {
            mapY.put(c, mapY.getOrDefault(c, 0) + 1);
        }

        List<Character> list = new ArrayList<>();
        for (char c : mapX.keySet()) {
            if (mapY.containsKey(c)) {
                int count = Math.min(mapX.get(c), mapY.get(c));
                for (int i = 0; i < count; i++) {
                    list.add(c);
                }
            }
        }

        if (list.isEmpty()) return "-1";
        String result = list.stream().sorted(Comparator.reverseOrder()).map(String::valueOf).collect(Collectors.joining());
        return result.matches("0+") ? "0" : result;
    }
}
