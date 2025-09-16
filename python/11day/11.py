l = ["hi", "there" , "a" , "v" , 'b' , "c"]

nos = [13,4,4,2,4,5,6,7,8,9,22,32,56]

# inputs = list(map(int, input("Enter a list seprated by commas : ").split(",")))
# number = []
# for num in inputs:
#     if num not in number :
#         number.append(num)
    


# print(number)

# unique = list()

no = [5, 6, 7, 8, 3, 4, 9, 1, 2]

# Write a program to count how many times an element occurs in a list.
# sorte = []
# smallest = 50
# while no:
#     for i in no:
#         if i < smallest:
#             smallest = i
#         sorte.append(smallest)
#         no.remove(smallest)
# print(sorte)

# Write a program to sort a list without using sort().
def bubbleSort(lis):
    n = len(lis)
    for i in range(n):
        for j in range(0,n-i-1):
            if  lis[j] > lis[j+1]:
                lis[j] , lis[j+1] = lis[j+1] , lis[j]
bubbleSort(no)
# Write a program to find the second largest element in a list.
# print(no[len(no)-2])

# Write a program to find common elements between two lists.
def compare(arr1,arr2):
    for i in arr1:
        if i in arr2:
            print(f"{i} exists in both lists")

# Write a program to print all prime numbers from a list.
# Write a program to print all prime numbers from a list.
def primeCheck (lis):
    x = len(lis)
    for i in range(2,x) :
        isPrime = True
        root = lis[i]**0.5
        for j in range(2,int(root)+1):
            lisNo = int(lis[i])
            if lisNo%j == 0:
                isPrime =False
        if  isPrime:
            print(f"{i} is a prime ")

# primeCheck(no)

# Write a program to create a matrix (list of lists) and print it in matrix form
# only for making a 3x3 marix 
def matrixMaker(lis):
    x = []
    y = []
    z = []
    row = 0
    for i in range(3):
        row +=1 
        # if row == 1:

            
            
            
            


# print(no)


# Write a program to merge two lists into one.
# l.extend(no)
# print(l)
