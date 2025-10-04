n = int(input("Enter a number: "))
c=n
s=0
k=0
while c!=0:
    k+=1
    c//=10
c=n
while c!=0:
    d=c%10
    s+=d**k
    c//=10
print("Armstrong number" if s==n else "Not an armstrong number")