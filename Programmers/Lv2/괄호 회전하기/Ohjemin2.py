from collections import deque
def solution(s):
    answer = 0
    queue = deque()
    for i in s:
        queue.append(i)
    for i in range(len(s)):            
        if rotate(''.join(list(queue))) == 0:
            answer +=1
        queue.rotate(-1)
    return answer

def rotate(s):
    while True:
        if "()" in s:
            s = s.replace("()","")
        elif "[]" in s:
            s = s.replace("[]","")
        elif "{}" in s:
            s = s.replace("{}","")
        else: 
            return -1 if s else 0  
