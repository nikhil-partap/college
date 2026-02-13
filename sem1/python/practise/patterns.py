#     2. Print a right triangle:
# *
# * *
# * * *
# * * * *


# for i in range(5):
#     for j in range(i+1):
#         print("*", end="")
#     print()


#     3. Print an inverted right triangle:
# * * * *
# * * *
# * *
# *


# n= 5
# for i in range(n):
#     for j in range(n-i):
#         print("*", end="")
#     print()



#     4. Print a pyramid:
#    *
#   * *
#  * * *
# * * * *

# n= 5
# for i in range(1,n+1):
#     front = " "*(n-i)
#     middle = " ".join("*"*(i))
#     print(front + middle )



#     5. Print an inverted pyramid:
# * * * *
#  * * *
#   * *
#    *

# n  = 4
# for i in range(1,n+1):
#     front = " "*(i-1)
#     middle = " ".join("*"*((n-i)+1))
#     print(front+middle)




#     6. Print numbers in increasing triangle:
# 1
# 1 2
# 1 2 3
# 1 2 3 4

# for i in range(5):
#     for j in range(1,i+2):
#         print(j,end="")
#     print()



#     7. Print numbers in a square:
# 1 2 3 4
# 1 2 3 4
# 1 2 3 4
# 1 2 3 4

# n= 4
# for i in range(1,n):
#     for j in range(1,n+1):
#         print(j, end="")
#     print()



#     8. Print repeated row numbers:
# 1
# 2 2
# 3 3 3
# 4 4 4 4

# n = 5
# for i in range(1,n+1):
#     for j in range(i):
#         print(i,end="")
#     print()



n = int(input("size: "))

matrix = [map(int, input().split())for i in range(n)]
for i in range(n):
    for j in range(n):
        if i == (n-1) or i == 0 or j == 0 or j == (n-1) :
            print(next(matrix[i]), end=" ")
        else:
            print(" ", end=" ")
    print()

