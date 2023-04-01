/*
1번 키부터 차례대로 할당된 문자들이 순서대로 담긴 문자열배열 keymap과 입력하려는 문자열들이 담긴 문자열 배열 targets가 주어질 때, 
각 문자열을 작성하기 위해 키를 최소 몇 번씩 눌러야 하는지 순서대로 배열에 담아 return하는 solution 함수를 완성해 주세요
keymap,	targets,	result
["ABACD", "BCEFD"],	["ABCD","AABB"],	[9, 4]
["AA"],	["B"],	[-1]
["AGZ", "BSSS"],	["ASA","BGZ"],	[4, 6]
*/

import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        List<Integer> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<keymap.length;i++){
            String[] key = keymap[i].split("");
            for(int j=0;j<key.length;j++){   
                if(map.containsKey(key[j])){                
                  if(map.get(key[j]) > j) map.put(key[j],j+1);
                }
                else map.put(key[j],j+1);
            }
        }
        for(String target : targets){
            int num = 0;
            String[] tr = target.split("");
            for(int i=0;i<tr.length;i++){
                if(map.containsKey(tr[i])) num += map.get(tr[i]);
                else{ 
                    num = -1;
                    break;
                }                
            }
            list.add(num);
        }
        System.out.println(list);
        return list.stream().mapToInt(i->i).toArray();
    }
}
