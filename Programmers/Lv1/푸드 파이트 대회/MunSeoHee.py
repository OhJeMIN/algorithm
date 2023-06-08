def solution(food):
    answer = "0"
    for index in range(len(food) - 1 , 0, -1) :
        food_str = food[index] // 2 * str(index)
        answer = food_str+ answer + food_str
    return answer
