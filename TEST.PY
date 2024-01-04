import sys
A = list(map(int, sys.stdin.readline().split()))

count =0
max_len =0
for i in range(1,len(A)):
    if A[i-1] < A[i]:
        count +=1
        if count > max_len:
            max_len = count
    else:
        count =1
print(max_len)