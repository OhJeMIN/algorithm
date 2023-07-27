class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cardOneidx = 0;
        int cardSecidx = 0;
        for (int i = 0; i < goal.length; i++) {
            if (cardOneidx < cards1.length && goal[i].equals(cards1[cardOneidx])) {
                cardOneidx++;
            } else if (cardSecidx < cards2.length && goal[i].equals(cards2[cardSecidx])) {
                cardSecidx++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}
