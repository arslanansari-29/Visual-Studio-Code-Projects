# # Making a simple calculator
# a = int(input("Enter the first number: "))
# b = int(input("Enter the second number: "))
# print("Choose your operator\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division")
# c = int(input("Enter your choice: "))
# if(c==1):
#   print("Sum of the numbers is: ",a+b)
# elif(c==2):
#   print("Difference of the numbers is: ",a-b)
# elif(c==3):
#   print("Product of the numbers is: ",a*b)
# elif(c==4):
#   print("Quotient of the numbers is: ",a/b)
# else:
#   print("Invalid choice")


d = 'A'
e = "B"
if d=="A":
  print("Capital")
  print("Vowel")
else:
  print("Consonant")
print(type(d))


f = """Arslan 
Ansari"""
len1 = len(f)
print(len(f))


g = """Lorem ipsum dolor sit amet,
consectetur adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua."""
for h in g:
  print(h)

nm = "Harry"
print(nm[-4:-2])
print(nm[0:5])
print(nm[0:4])

i = "The center function"
print(i.center(50, "."))
print(len(i), "This is the length of the string")
print(len(i.center(1)), "This is the length of the string after center function")


str = "!!! Arslan Ansari !!!"
print(str.upper())
print(str.lower())
print(str.strip())
print(str.rstrip("!"))
print(str.replace("Arslan", "Falaq"))
print(str.split(" "))
print(str.count("a"))
str2 = "aaj friday hai"
print(str2.capitalize())
print(len(str2))
