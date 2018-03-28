Swap numbers without temp OR A 3RD VARIABLE 
a = 10
b = 5
METHOD 1 
---------------------------------
a = a + b
b = a - b
a = a - b

METHOD 2
---------------------------------
a = a * b 
b = a / b
a = a / b

METHOD 3
---------------------------------
Using Bitwise Operators as well 

-> USING EX - OR OPERATOR 

a = 1 0 1 0 
b = 0 1 0 1 
------------
a = 1 1 1 1 
------------

    1 1 1 1 
    0 1 0 1 
------------
b = 1 0 1 0 
------------

a = 1 1 1 1 
b = 1 0 1 0 
------------
s = 0 1 0 1
------------ 