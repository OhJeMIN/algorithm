def solution(phone_book):
    answer = True
    hash_pb={}
    for i in phone_book:
        hash_pb[i] = hash(i)
    for i in range(len(phone_book)):
        num =''
        for k in phone_book[i]:
            num +=k
            if hash_pb.get(num,0) != 0 and num != phone_book[i]:
                return False
    return True
