from collections import deque
def solution(begin, target, words):
    answer = 0
    if words.count(target) == 0:
        return 0
    visited = [False for i in range(len(words))]
    queue = deque()
    queue.append([begin,0])
    while queue:
        popped,cnt = queue.popleft()
        if popped == target: 
            answer = cnt
            break;
        for idx, word in enumerate(words):
            same = 0
            contains = 0
            for i in range(len(word)):
                if popped[i:i+1] != word[i:i+1]:
                    same+=1                                 
            if same == 1 and not visited[idx]:
                visited[idx] = True
                queue.append([word,cnt+1])
    return answer
