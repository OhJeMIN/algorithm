def solution(s):
    myStack = []
    for i in s:
        if i =='(':
            myStack.append(i);
        else : 
            if myStack:
                myStack.pop();
            else: return False
    return False if myStack else True
