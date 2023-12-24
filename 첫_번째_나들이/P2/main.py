import sys

N = int(sys.stdin.readline())
fee_counts = [0] * 1001
jinju_fee = None
count = 0
for _ in range(N):
    destination, fee = sys.stdin.readline().split()
    fee = int(fee)
    
    if fee > 1000:
        count+=1
    else:        
        if destination == "jinju":
            jinju_fee = fee 
        fee_counts[fee] +=1

count += sum(fee_counts[jinju_fee + 1:])
print(jinju_fee)
print(count)
