import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class backJoon14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] Nm = br.readLine().split(" ");
        ArrayList<String> S = new ArrayList<>();
        int result = 0;
        for(int i=0;i<Integer.parseInt(Nm[0]);i++){
            S.add(br.readLine());
        }
        for(int i=0;i<Integer.parseInt(Nm[1]);i++){
            if(S.contains(br.readLine())) result++;
        }
        System.out.print(result);
    }
}
