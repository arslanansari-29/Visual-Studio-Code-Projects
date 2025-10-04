a = input("Enter your first name to get it's each character vertically: ")
for ch in a:
    print(ch)
b = input("Enter your last name to get it's each character horizontally: ")
for ch2 in b:
    print(ch2, end=",")
s = int(input("Enter number from where you want to start: "))
e = int(input("Enter number till where you want to print: "))
for Range in range(s,e+1):
    print(Range, end=",")
