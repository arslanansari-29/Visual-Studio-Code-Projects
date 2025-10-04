n = int(input("Enter a number: "))
c=n
s=0
p=1
while c!=0:
    d = c%10
    s+=d
    p*=d
    c//=10
print("Spy number" if s==p else "Not a spy number")
