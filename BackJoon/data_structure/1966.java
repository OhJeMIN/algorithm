package org.example;
import java.io.*;
import java.util.*;
/*d
* 상근이가 만든 프린터 함수 sangPrinter
* 테스트 큐를 만드는 함수 generateTaskQueue
* 중요도 큐를 만드는 함수 generateTaskQueue
* 중요도 검사 함수 chkImp
* 중복 중요도 검사함수 chkSame
* */
public class backJoon1966 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        int taskCaseNum = Integer.parseInt(br.readLine());
        for(int i=0;i<taskCaseNum;i++){
            sangPrinter(br);
        }
    }
    //프린터
    public static void sangPrinter(BufferedReader br) throws IOException{
        String[] MN = br.readLine().split(" ");
        String[] importanceInput = br.readLine().split(" ");
        Queue<Integer> importanceQueue = new LinkedList<>();
        Queue<Integer> TaskQueue = new LinkedList<>();
        TaskQueue = generateTaskQueue(Integer.parseInt(MN[0]));
        importanceQueue = generateImportanceQueue(importanceInput);
    }
    //테스크 큐 만드는 함수
    public static Queue<Integer> generateTaskQueue(int count){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<count;i++) q.add(i);
        return q;
    }
    //중요도 큐 함수
    public static Queue<Integer> generateImportanceQueue(String[] importance){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<importance.length;i++) q.add(Integer.parseInt(importance[i]));
        return q;
    }
    //중요도 검사함수
    public static void chkImp(Queue<Integer> TaskQueue, Queue<Integer> importanceQueue){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<importanceQueue.size();i++){
            map.put(TaskQueue.poll(), importanceQueue.poll());
        }
        int importanceMax = Collections.max(map.keySet());
        for(int i=0;i<importanceQueue.size();i++){
            int poppedImportanceQueue = importanceQueue.peek() != null ? importanceQueue.poll() : -1;
            int poppedTaskQueue = TaskQueue.peek() != null ? TaskQueue.poll() : -1;
            if(poppedImportanceQueue > 0 && poppedTaskQueue > 0){
                if(importanceMax == poppedImportanceQueue){
                    map.remove(importanceMax);
                }
                else{
                    importanceQueue.add(poppedImportanceQueue);
                    TaskQueue.add(poppedTaskQueue);
                }
            }
        }
    }
    //중복 중요도 검사함수
    public static void chkSame(){

    }
}
