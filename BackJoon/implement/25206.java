import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    //전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
    private static HashMap<String, Double> gradeScale = new HashMap<String, Double>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double scoresSum = 0;
        double GPA = 0;
        gradeScale.put("A+", 4.5);
        gradeScale.put("A0", 4.0);
        gradeScale.put("B+", 3.5);
        gradeScale.put("B0", 3.0);
        gradeScale.put("C+", 2.5);
        gradeScale.put("C0", 2.0);
        gradeScale.put("D+", 1.5);
        gradeScale.put("D0", 1.0);
        gradeScale.put("F", 0.0);
        for (int i = 0; i < 20; i++){
            String[] score = br.readLine().split(" ");
            if(!score[2].equals("P")){
                scoresSum += Double.parseDouble((score[1]));
                GPA += Double.parseDouble(score[1]) * gradeScale.get(score[2]);
            }
        }
        System.out.println(Math.round((GPA / scoresSum) * 1e6) / 1e6);
    }
}
