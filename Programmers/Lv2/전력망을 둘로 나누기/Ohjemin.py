def solution(n, wires):
    answer = -1
    visited = [[False for j in range(len(wires))] for i in range(len(wires))]
    network = {}
    networkR = {}
    for idx, n in wires:
        network[idx] = network.get(idx, []) + [n]
        networkR[n] = networkR.get(n, []) + [idx]            
    
    def flow(idx, num, key, val, network, visited, n):
        if idx == key && num == val:
            return n
        if !visited[key][val] && !visited[val][key]:
            visited[key][val] = True
            visited[val][key] = True
            n-=1
            flow(idx,num, val, network[val], network, visited, n)
                
        
    for idx, num in enumerate(wires):
        int dividedNet = 0
        for key, val in network.items():
            flow(idx, num, key, val, network, visited, n)
    
            
    print(network)
    print(networkR)
    return answer
