import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class backJoon2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            int input = Integer.parseInt(br.readLine());
            pq.add(input);
        }
        for(int i=0;i<N;i++){
            System.out.println(pq.poll());
        }
        
       /* 
       //버블 정렬
       int arr[] = new int[N];
       for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i=0;i<N-1;i++){ // 맨마지막에 2개가 스왑 되므로 끝까지 갈 필요 없다
            for(int j=0;j<N-1-i;j++){ //N-1-i 루프가 돌수록 뒤에 정렬된 데이터를 제외하고 돌린다.
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }*/
    }
}
