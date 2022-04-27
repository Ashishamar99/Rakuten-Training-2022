# x = bin(45)
# y = bin(44)
# print(int(y, 2)) # Printing binary numbers in base 2 ie. decimal

x=45
y=56
z = x&y
print(z)

z=x|y
print(z)

print(~x)

print(bin(x<<2), "left shift x")
print(bin(x>>2), "right shift x")