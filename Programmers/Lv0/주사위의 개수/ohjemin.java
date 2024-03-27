public class Solution {
    public int solution(int[] box, int n) {
        int widthFit = box[0] / n;
        int lengthFit = box[1] / n;
        int heightFit = box[2] / n;
        
        int maxDice = widthFit * lengthFit * heightFit;
        
        return maxDice;
    }
}
