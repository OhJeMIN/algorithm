import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] patterns = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            boolean isValid = true;
            for (String pattern : patterns) {
                if (word.contains(pattern + pattern)) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                String tempWord = word;
                for (String pattern : patterns) {
                    tempWord = tempWord.replaceAll(pattern, " ");
                }
                tempWord = tempWord.trim();
                if (tempWord.length() == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
