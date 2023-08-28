import itertools
import re
def solution(expression):
    answer = []
    expression = re.split("([^0-9])",expression)
    arr2 = ['*', '+', '-']
    opList = itertools.permutations(arr2, 3)
    for ops in opList:
        exp = expression
        for op in ops:
            tmp = []
            for ex in exp:
                if tmp and tmp[-1] == op:
                    cal = tmp.pop()
                    tmp[-1] = operate(cal,int(tmp[-1]),int(ex))
                else:
                    tmp.append(ex)
            exp = tmp
        answer.append(abs(exp[0]))
    return max(answer)

def operate(op,a,b):
    if op == '+':
        return a+b
    if op == '-':
        return a-b
    if op == '*':
        return a*b
    
