import java.util.*;
class Solution {
    boolean solution(String s) {
        String lowerS = s.toLowerCase();
        String[] arr = lowerS.split("");
        List<String> list = Arrays.asList(arr);
        int pNum = Collections.frequency(list, "p");
        int yNum = Collections.frequency(list, "y");
        if(pNum == yNum) return true;
        else return false;
    }
}
