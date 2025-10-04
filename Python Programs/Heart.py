import math
from turtle import *

def heart_a(k):
    return 15 * math.sin(k) ** 3

def heart_b(k):
    return 12 * math.cos(k) - 5 * math.cos(2 * k) - 2 * math.cos(3 * k) - math.cos(4 * k)

speed(0)
bgcolor("black")
color("#f73487")

up()
goto(heart_a(0) * 20, heart_b(0) * 20)
down()

for i in range(1, 1000):
    goto(heart_a(i) * 20, heart_b(i) * 20)

done()

    