class Solution {
    public int solution(int[] num_list) {
        int oddNums = 0;
        int evenNums = 0;
        for(int i=0;i<num_list.length;i+=2){
            oddNums+=num_list[i];
        }
        for(int i=1;i<num_list.length;i+=2){
            evenNums+=num_list[i];
        }
        return oddNums > evenNums ? oddNums : evenNums;
    }
}
