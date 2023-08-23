def solution(arr):
    answer = 1
    for i in range(2,max(arr)):
        divided = [0] * len(arr)
        for idx, num in enumerate(arr):
            if num % i == 0:
                divided[idx] = 1
        if divided.count(1) >= 2:
            answer *=i
            for s in range(len(arr)):
                if arr[s] % i == 0:
                    arr[s] //= i
    for i in arr:
        answer *=i
    return answer
