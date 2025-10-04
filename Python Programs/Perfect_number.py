n = int(input("Enter a number: "))
c = 0
for i in range(1, n):
    if n%i == 0:
        c+=i
if n==c:
    print("Perfect number")
else:
    print("Not a perfect number")