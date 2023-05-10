def solution(tickets):
     # 1. 그래프 생성
    routes = dict()
    for (start, end) in tickets:
        routes[start] = routes.get(start, []) + [end] 
    
    # 2. 시작점 - [끝점] 역순으로 정렬  
    for i in routes.keys():
        routes[i].sort(reverse = True)
    
    now = ["ICN"]
    visited = []    
    while now:      
        top = now[-1]
        #top이 그래프에 없거나, top을 시작점으로 하는 티켓이 없는 경우, 스택에서 꺼내와 visited에 저장        
        if top not in routes or len(routes[top]) == 0:
            visited.append(now.pop())
        #top을 시작점으로 하는 끝점 중 가장 마지막 지점을 꺼내와 스택에 저장
        else:
            now.append(routes[top][-1])
            routes[top] = routes[top][:-1]
    answer = visited[::-1]
    return answer
