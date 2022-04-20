a = """This is a multiline
 string which is surrounded
 by a pair of 3 times the double quotes."""

print(a)
print('----')

b = "Hello, World!"
print(b[2:5], "Slicing from index 2 to 5")
print(b[-5:-2], "Slicing from negative index 5 to 2")
print('----')

print(b.upper())
print(b.lower())
print((b+"aa aa ").strip())
print(b.replace("H", "J"))
print('----')

