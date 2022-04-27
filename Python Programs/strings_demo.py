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

print('Formatting Strings - ')
quantity = 3
itemno = 567
price = 49.95
myorder = "I want {} pieces of item {} for {} dollars."
print(myorder.format(quantity, itemno, price))
print('----')

myorder = "I want to pay {2} dollars for {0} pieces of item {1}."
print(myorder.format(quantity, itemno, price))
print('----')

print('Escape Characters -')
#A backslash followed by three integers will result in a octal value:
txt = "\110\145\154\154\157"
print(txt, "\"ooo for octal value printing.")
print("This line will be \f printed in 2 pages, 2nd page starts with 'printed...' ")
print('"\\r\\n" is used for a new line in Windows format whereas, just a "\\n" is used for Linux')
#A backslash followed by an 'x' and a hex number represents a hex value:
txt = "\x48\x65\x6c\x6c\x6f"
print(txt) 
print('----')

#Check out all these methods - https://www.w3schools.com/python/python_strings_methods.asp