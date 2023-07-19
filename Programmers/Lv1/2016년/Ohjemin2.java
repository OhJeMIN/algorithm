import java.util.*;
class Solution {
    public String solution(int a, int b) {
        int days = 0;
        HashMap<Integer, Integer> calender = new HashMap<>();
        String[] dayRotate = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        for(int i=1;i<=12;i++){
            if(i < 8){
                if(i == 2) calender.put(i,29);
                else{
                    if(i % 2 ==0) calender.put(i,30);
                    else calender.put(i,31);
                }
            }
            else{
                if(i % 2 ==0) calender.put(i,31);
                else calender.put(i,30);
            }
        }
        for(int i=1;i<a;i++){
            days += calender.get(i);
        }
        return dayRotate[(days+b-1)%7];
    }
}
