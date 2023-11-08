import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fileNum = Integer.parseInt(scanner.nextLine());
        String[] s = scanner.nextLine().split("\\*",2);
        for(int i=0;i<fileNum;i++){
            String fileName = scanner.nextLine();
            if(fileName.length()< s[0].length() + s[1].length()) {
                System.out.println("NE");
                continue;
            }
            System.out.println((fileName.startsWith(s[0]) && fileName.endsWith(s[1]))? "DA" : "NE");
        }
    }
}
