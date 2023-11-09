import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> locker = new HashMap<>();
        for(int i=0;i<testCase;i++){
            int clothes = Integer.parseInt(br.readLine());
            for(int j=0;j<clothes;j++){
                String[] clothesType = br.readLine().split(" ");
                locker.put(clothesType[1], locker.getOrDefault(clothesType[1],0)+1);
            }
            int answer = 0;
            if(locker.size() <= 1 ? true : false){
                answer += locker.values().stream().mapToInt(Integer::intValue).sum();
                System.out.println(answer);
            }else{
                answer +=locker.values().stream().mapToInt(num -> num+1).reduce(1,(a, b) -> a * b);
                System.out.println(answer-1);
            }
            locker.clear();
        }

    }
}
