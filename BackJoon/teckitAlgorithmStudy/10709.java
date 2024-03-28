import java.util.Scanner;

public class Main {
    private static String[][] JOI;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Yx = scanner.nextLine().split(" ");
        JOI = new String[Integer.parseInt(Yx[0])][Integer.parseInt(Yx[1])];
        Integer[][] Answer = new Integer[Integer.parseInt(Yx[0])][Integer.parseInt(Yx[1])];
        for(int y = 0; y < Integer.parseInt(Yx[0]) ;y++){
            String clouds = scanner.nextLine();
            for(int x=0;x<clouds.length();x++){
                String cloud = clouds.substring(x,x+1);
                if(cloud.equals("c")) Answer[y][x] = 0;
                else Answer[y][x] = -1;
                JOI[y][x] = cloud;
            }
        }
        for(int y = 0; y < Integer.parseInt(Yx[0]) ;y++){
            String[] cloud = JOI[y];
            for(int x=0;x<cloud.length-1;x++){
                if(cloud[x].equals("c")){
                    if(Answer[y][x+1] < 0){
                        Answer[y][x+1] = Answer[y][x] +1;
                        cloud[x+1] = "c";
                    }
                }
            }
        }
        for(Integer[] s : Answer){
            for(Integer i : s){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
