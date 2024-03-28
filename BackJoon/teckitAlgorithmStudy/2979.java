import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bills = scanner.nextLine().split(" ");
        int[] times = new int[101];
        int answer = 0;
        Arrays.fill(times,0);
        for(int i=0;i<3;i++){
            int arrive = scanner.nextInt();
            int leave = scanner.nextInt();
            for(int j =arrive; j<leave;j++){
                times[j]++;
            }
        }
        for(int i=0;i<101;i++){
            if(times[i] == 1){
                answer +=Integer.parseInt(bills[0]);
            }
            else if(times[i] == 2){
                answer +=Integer.parseInt(bills[1]) * 2;
            }
            else if(times[i] == 3){
                answer +=Integer.parseInt(bills[2]) * 3;
            }
        }
        System.out.println(answer);
    }
}
