#Basic Pyhton
import math #imports math operations
print("hello world")#print function
print(math.floor(3.75))

#Variables
a=1
b=3.75
print("sum of a &b is " ,a+b)
print(type(a))#type fun-gives the datatype of the variable
print(type(b))
c='Shiva Raj'
print("My name is ",c)
# print(type(c))

#Strings and its functions
str1="this is python string"
print(str1)
print(str1.find("is"))#Finds the required sub strings and gives its index number
print(str1.capitalize())#Capitalises the first letter of the string
print(str1.upper())#converts all letter of string into uppercase
print(str1.lower())#converts all letter of string into lowercase

#Lists
items=['shiva',2,3]
print(items)
print(type(items))
items[2]='vishnu' #reassiging of values in lists
print(type(items))
print(items)

# Tuple
#we cannot reassign values in tuple and rest all is same as Lists
tup1=('shiva',5,70)
print(type(tup1))
# tup1[1]=0
print(tup1)

#Dictionary
dict1={"virat":100, "sachin":200}
dict1["dhoni"]=150# we can add items to the dictionary in this way also
print(dict1)
print(dict1.get("sachin"))
print(dict1["virat"])
print(type(dict1))
print(dict1.items())
print(dict1.keys())

#Sets
list1=[1,2,5,5,8,8,9,7]
print("List = ",list1)
set1=set(list1) #type casting list into set
print("Set =",set1)

#Operators
x=10
y=20
z="raj"
print(x+y)
# print(x+y+z)
print(str(x)+str(y)+z)#type casting as well as adding 
print("70-50 =",70-50)
print("70*50 =",70*50)
print("70/50 =",70/50)
print("70%50 =",70%50)
print("70//50 =",70//50)

#Input
print("Enter anything")
var=input()#can enter anything and it is stored as string datatype
print(var)
print(type(var))
print("Enter anything")
var1=int(input())#can enter only integers, stored as int datatype
print(var1)
print(type(var1))

#Conditional operations
print("enter a number")
var2=int(input())
if(var2>10):
    print("given number is greater than 10")
elif(var2==10):
    print("given number is equal to 10")
else:
    print("given number is less than 10")

#Loops
#for loop: updation happens automatically, no need of 'i+1'
for i in range(0, 101): #last number not into consideration
    print(i) #prints numbers from 0 to 100
    print("ram") #ram is printed 101 times

#while loop: need to be updated, if we need any updation
j=0 #initialisation
while(j<101):
    print(j)
    print("shyam")
    j=j+1 #if this is not mentioned then function repeats for infinte times 
    #as 'j=0' will be always less than '101'

#Functions: when we want to use a particular operation multiple times then we can
#create a function
def sum(num1, num2): #defining a function
    summation= num1+num2
    return summation
addition=sum(2,999) #function calling
print("the sum of 2 & 999 is",addition)

def average(num1, num2): #defining a function
    avg=(num1+num2)/2
    return avg
mean=average(10,20) #Function calling
print("the average of 10 & 20 is",mean)

#try-except in python: allows the program to run even if there is an error in between
try:
    print(raj)#obviously it is going to throw an error because raj is not 
    #defined anywhere but using exception we can convert error into a statement
except Exception as s:
    print(s)
# so that when there is an error in between the program, so to not stop
#the progress of the program we use try-except 

#opening, writing and reading of a file
f= open("sample.txt", "w")
f.write("Shiva Raj")#writing or creating a file
f.close()
g=open("sample.txt", "r")
name=g.read()#reading a file
g.close()
print(name)