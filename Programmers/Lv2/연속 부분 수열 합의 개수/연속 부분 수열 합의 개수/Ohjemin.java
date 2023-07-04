import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i=1; i<=len; i++) {
            for (int j=0; j<len; j++) {
                int sum = 0;
                for (int k=j; k<j+i; k++) {
                    sum += elements[k%len];
                }
                set.add(sum);
            }
        }
        return set.size();
    }
}
