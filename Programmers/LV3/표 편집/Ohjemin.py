from collections import deque
def solution(n, k, cmd):
    answer = ''
    default_graph = ["무지","콘","어피치","제이지","프로도","네오","튜브","라이언"]
    change_graph = ["무지","콘","어피치","제이지","프로도","네오","튜브","라이언"]
    queue = deque()
    index = 0
    for c in cmd:
        if len(c)>2 :
            if c[0] == 'D':
                k += int(c[2])
            else:
                k -= int(c[2])
        else:
            if c[0] == 'C':
                if k == n-1:
                    queue.append([change_graph[k],k])
                    change_graph.remove(change_graph[k])
                    change_graph.append("")
                    k = k-1
                else :
                    queue.append([change_graph[k],k])
                    change_graph.remove(change_graph[k])
                    change_graph.append("")
            else:
                value, idx = queue.pop()
                change_graph.insert(idx,value)
    index = 0
    for i in range(len(default_graph)):
        if(default_graph[i] == change_graph[index]):
            answer+='O'
            index+=1
        else:
            answer+='X'
            
    return answer
