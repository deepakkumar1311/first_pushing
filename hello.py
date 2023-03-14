# n=int(input("Enter number: "))
# for i in range(1,11):
#     print(n,"*",i,"=",n*i)

# l1=["Harry", "Sohan", "Sachin", "Rahul"]
# for item in l1:
#    if item.startswith("S"):
#     print("Hello "+item)

# n=int(input("Enter number: "))
# i=1
# while (i<=10):
#     print(n,"*",i,"=",n*i)
#     i=i+1

# n=int(input("Enter number: "))
# x=False
# for i in range(2,n):
#     if n%i==0:
#         x=True
#         break
# if(x==True):
#     print(n,"is not a prime number")
# else:
#     print(n,"is a prime number")


# n=int(input("Enter number: "))
# i=1
# sum=0
# while(i<=n):
#     sum=sum+i
#     i=i+1
# print("The sum of the numbers is",sum)

# n=int(input("Enter number: "))
# for i in range(n+1):
#     print(" *"*i)
#     i=i+1

# n=int(input("Enter number: "))
# l=[]
# for i in range(1,11):
#     l.append(n*i)

# l.reverse()
# for i in range(10):
#     print(l[i])
 
# def function_recursive(n):
#     if n==0 or n==1:
#         return 1
#     return n*function_recursive(n-1)
# f=function_recursive(7)
# print(f)

# def fun(n1,n2,n3):
#     if(n1>n2):
#         d=n1
#     else:
#         d=n2
#     if(d>n3):
#         f=d
#     else:
#         f=n3
#     return f

# a=int(input("Enter number: "))
# b=int(input("Enter number: "))
# c=int(input("Enter number: "))

# print((fun(a,b,c)))
    
# def fun(c):
#     f=c*1.8+32
#     return f
# c=int(input("Enter number: "))
# print(fun(c))

# def fun_recursive(n):
#     if(n==1):
#         return 1
#     return fun_recursive(n-1)+n
# n=int(input("Enter number:"))
# print(fun_recursive(n))

# n=int(input("Enter number: "))
# l=[]
# for i in range(1,n+1):
#     l.append(i)
# l.reverse()
# for j in range(n):
#     print("* "*l[j])

# def remove_strip(string,word):
#     new_str=string.replace(word,"")
#     return new_str.strip()
# this= "hello Deepak bro"
# print(remove_strip(this,"hello"))

# n=int(input("Enter number:"))
# l=[]
# for i in range(n):
#     n=int(input("Enter number:"))
#     l.append(n)
# a=set()
# for j in range(n):
#     a.add(l[j])
# s=list(a)
# print(s)

# n1=int(input("Enter number: "))
# n2=int(input("Enter number: "))
# if((n1*n2)>1000):
#     print(n1+n2)
# else:
#     print(n1*n2)

n=int(input("Enter Number: "))
l=[]
for i in range(n):
    n=int(input("Enter Number: "))
    l.append(n)
for j in range(n):
    if(l[j]%3==0 or l[j]%5==0):
        print(l[j],end=' ')
   






