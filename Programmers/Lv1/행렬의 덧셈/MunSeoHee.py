def solution(arr1, arr2):
    for i in range(0, len(arr1)) :
        for j in range(0, len(arr1[i])) :
            arr1[i][j] = arr1[i][j] + arr2[i][j]
    return arr1