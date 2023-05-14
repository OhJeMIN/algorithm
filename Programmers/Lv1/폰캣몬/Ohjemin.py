def solution(nums):
    answer = 0
    length = len(nums) // 2
    visited = [False for i in range(len(nums))]
    num = []
    for i in range(len(nums)):
        if len(num) == length: break
        if not visited[i] and not(nums[i] in num):
            visited[i] = True
            num.append(nums[i])            
    return len(num)
