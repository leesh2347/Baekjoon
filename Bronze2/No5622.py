nums=['ABC','DEF','GHI','JKL','MNO','PQRS','TUV','WXYZ']
inputs=str(input())
inputs=inputs.upper()
total=0
j=0
for i in inputs:
    for j in range(len(nums)):
        if(nums[j].find(i)!=(-1)):
            total=total+j+3

print(total)
