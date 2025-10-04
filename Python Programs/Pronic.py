n = int(input("Enter a number: "))
c=n
b=False
for i in range(1, n+1):
    if c%i==0 and c%(i+1)==0 and i*(i+1)==0:
        b=True
        break
print("Pronic number" if b==True else "Not a pronic number")