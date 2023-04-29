import java.util.*;
class Solution {
    static Map<Integer,Integer> map = new HashMap<>();
    
    public int[] solution(String[] park, String[] routes) {
        
        int x = 0,y =0;
        for(int i=0;i<park.length;i++){
            String parkStart = park[i];
            for(int j=0;j<parkStart.length();j++){
                if(parkStart.charAt(j)=='S'){
                    y=i;x=j;
                }
            }
        }
       for(int i=0;i<routes.length;i++){
            String order = routes[i];
            int num = (order.charAt(2)-'0');
            int moveX = x;
            int moveY = y;
            boolean success = true;
            for(int j=0;j<num;j++){
                if(order.charAt(0) =='E') moveX ++;
                else if(order.charAt(0) == 'W') moveX--;  
                else if(order.charAt(0) == 'S') moveY++;
                else moveY--;
                if(!validateBlocked(park, moveX, moveY)){
                    success = false;
                    break;
                }
            }
           if(success){
               x=moveX;
               y=moveY;
           }
        }
        int[] answer = new int[2];
        answer[0] = y;
        answer[1] = x;
        return answer;
    }
    
    private boolean validateBlocked(String[] park,int moveX,int moveY){
        int height = park.length;
        int width = park[0].length();
        if(moveY < 0 || moveY >= height) return false;
        if(moveX < 0 || moveX >= width) return false;
        if(park[moveY].charAt(moveX) == 'X') return false;
        return true;
    }
}
