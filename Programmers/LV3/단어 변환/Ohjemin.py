from collections import deque
def solution(begin, target, words):
    answer = 0
    if words.count(target) == 0:
        return 0
    visited = [False for i in range(len(words))]
    queue = deque()
    queue.append(begin)
    while queue:
        popped = queue.popleft()
        if popped == target: break;
        for idx, word in enumerate(words):
            same = 0
            contains = 0
            for i in range(len(word)):
                if popped[i:i+1] == word[i:i+1]:
                    same+=1
                else:
                    if word[i:i+1] in target:
                        contains +=1                    
            if same == 2 and not visited[idx] and contains == 1:
                answer +=1
                visited[idx] = True
                print(word)
                queue.append(word)
    return answer
