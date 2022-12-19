def solution(my_string):
    vowels = ['a', 'e', 'i', 'o', 'u']
    for char in vowels :
        my_string = my_string.replace(char, '')
    return my_string
