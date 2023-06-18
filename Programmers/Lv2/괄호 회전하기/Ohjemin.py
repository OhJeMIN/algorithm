from collections import deque
def solution(s):
    answer = 0
    queue = deque()
    for i in s:
        queue.append(i)
    for i in range(len(s)):
        if i == 0:
            if rotate(s) == 0:
                answer +=1
        else:
            queue.append(queue.popleft())
            if rotate(''.join(list(queue))) == 0:
                answer +=1
    return answer

def rotate(s):
    stack = []
    for i in s:
        if i == "[" or i == "(" or i == "{":
            stack += i
        else:
            if len(stack) == 0:
                stack += i
            else:
                x = stack[-1]
                if x == "[" and i == "]":
                    stack.pop()
                elif x == "{" and i == "}":
                    stack.pop()
                elif x == "(" and i == ")":
                    stack.pop()
                else:
                    stack += i
    
    return len(stack)
