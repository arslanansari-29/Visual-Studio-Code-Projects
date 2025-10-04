n = int(input("Enter a number: "))
c=n
k=0
while c!=0:
    c//=10
    k+=1
print(k)