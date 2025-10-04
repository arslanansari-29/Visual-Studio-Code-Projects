print("1- Celcius to Fehrenheit\n2- Fehrenheit to Celcius\nEnter your coice: ")
a = int(input())
match a:
    case 1:
        C = float(input("Enter temperature: "))
        F = 9/5*C+32
        print("Temperature in Fehrenheit is:",F)
    case 2:
        F = float(input("Enter temperature: "))
        C = (5/9)*(F-32)
        print("Temperature in Celcius is:",C)
    case _:
        print("Wrong input")