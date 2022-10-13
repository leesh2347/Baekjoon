n=int(input())

i=1
sum=0
while True:
    sum=sum+i
    if(sum>=n):
        break
    i+=1
sum=sum-i
n=n-sum
if(i%2==0):
    print(f"{n}/{(i-n+1)}")
else:
    print(f"{(i-n+1)}/{n}")
