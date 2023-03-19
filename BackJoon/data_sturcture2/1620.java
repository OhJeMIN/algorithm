import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class backJoon1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Map<String,Integer> map = new HashMap<String,Integer>();
        String[] pokeDoGam2 = new String[Integer.parseInt(input[0])+1];
        map = pokeDoGam(map,pokeDoGam2, Integer.parseInt(input[0]),br);
        pokeDoGamResult(map , pokeDoGam2 ,Integer.parseInt(input[1]),br);
    }
    public static Map<String,Integer> pokeDoGam(Map<String,Integer> map, String[] pokeDoGam2, int input ,BufferedReader br) throws IOException {
        for(int i=1;i<=input;i++){
            String key = br.readLine();
            map.put(key,i);
            pokeDoGam2[i] = key;
        }
        return map;
    }

    public static void pokeDoGamResult(Map<String,Integer> map, String[] pokeDoGam2, int problem,BufferedReader br) throws IOException{
        StringBuilder st = new StringBuilder();
        for(int i=1;i<=problem;i++){
            String input = br.readLine();
            if(input.matches("[-+]?\\d*\\.?\\d+")){
                st.append(pokeDoGam2[Integer.parseInt(input)]);
            }
            else st.append(map.get(input));
            if(i != problem )st.append("\n");
        }
        System.out.print(st);
    }

}
