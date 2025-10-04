n=int(input("Enter a number: "))
c=n
b=False
while c!=0:
    d=c%10
    if d==0:
        b=True
        break
    c//=10
print("Duck number" if b==True else "Not a duck number")
