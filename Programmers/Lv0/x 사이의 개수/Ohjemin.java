import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(String myString) {        
        String[] strX = myString.split("x");
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<strX.length; i++) list.add(strX[i].length());        
        if(myString.charAt(myString.length()-1) == 'x') list.add(0);
        return list.stream().mapToInt(i -> i).toArray();
    }
}
