n = int(input("Enter a number: "))
c=n
s=0
sq=n*n
while sq!=0:
    d=sq%10
    s+=d
    sq//=10
print("Neon number" if s==n else "Not a neon number")