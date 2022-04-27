import random
 
x = 1    # int
y = 2.8  # float
z = 1j   # complex
print(type(x))
print(type(y))
print(type(z))
print('----')

x = 35e3
print(type(x)) # with e, we get floating points as well
print('----')

x = 3+5j
y = 5j
z = -5j
print(type(x))
print(type(y))
print(type(z))
print('----')

print('Random number = ', random.randrange(1, 10))