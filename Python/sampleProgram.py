#This is my first program

"""
Multi line comment aka doostring
also import modulename [as alias]
"""

import random as r

ans = r.randint(-10,10)
ans2 = r.randrange(20,-10,-10)

x = 10
print(x)
print(ans)
print(ans2)


#floats
x = 10e100
print(x)
x = 11e3
print(x)
#complex
x = 10+4j
print(x)
x += 10j
print(x)
#string
x = 'Mary\'s dog said \n"Woof!".'
print(x)
# arithmetic ops - ** exponent, // floor division
# comparison ops ==, !=, is -> object identity, is not -> negated object identity
# boolean ops or, and, not

#pep 8  style guidelines 
p_as = "stroke heavy civil as"
#python building blocks
print(x)
x = abs(-10)
print(x)
x = round(10.3553232,2)
print(x)
x = round(10.3553232)
print(x) 
x = int(12.8)
print(x) 
x = float(122)
print(x) 
print(x) 
print(type(x))
x = str(11)
print(x) 
print(type(x))
print(x) 
x = max(2,3,4,9)
print(x) 
print(type(x))
print(x) 
x = hex(33)
print(x) 
print(type(x)) 
x = oct(33)
print(x) 
print(x) 
print(type(x))
x = bin(33)
print(x) 
print(type(x))
print(x) 
print((str('a'))+'b')
# x = int('a')
print(x) 
print(type(x))
# math funs
import math as matkar
x = matkar.sqrt(333)
print(x) 
print(type(x))

x = matkar.acos(matkar.radians(30))
print(x) 
print(type(x))
x = matkar.sin(matkar.radians(90))
print(x) 
print(type(x))
x = (matkar.radians(90))
print(x) 
print(type(x))
x = (matkar.degrees(1.314))
print(x) 
print(type(x))
x = (matkar.degrees(1.5707))
print(x) 
print(type(x))
x = (matkar.degrees(matkar.pi))
print(x) 
print(type(x))
x = (matkar.degrees(matkar.e))
print(x) 
print(type(x))
x = (matkar.degrees(1))
print(f"One radian has {x:,.2f} degrees") 
print(type(x))
y = ((matkar.degrees(1)))/(matkar.degrees(matkar.pi))
print(f"One radian is {y:,.2%} of pi radian(180 degrees)") 
print(type(x))

x = (matkar.radians(57.3000004448))
print(x) 
print(type(x))
q = 32
unit_price = 49.95
sales_tax_rate = 0.065
subtotal = q*unit_price
sales_tax = sales_tax_rate*subtotal
total = sales_tax+subtotal
op = f"""
Subtotal:   ${subtotal:>9,.2f}
Sales Tax:  ${sales_tax:>9,.2f}
Total:      ${total:>9,.2f}
"""
print(op)


