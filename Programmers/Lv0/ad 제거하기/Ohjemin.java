import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> strList = new ArrayList<>();
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].contains("ad")){
                strList.add(strArr[i]);
            }
        }        
        return strList.stream().toArray(i -> new String[i]);
    }
}
