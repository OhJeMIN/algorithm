import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int[] arr = new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<word.length();i++){
            arr[word.charAt(i)-97] +=1;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
