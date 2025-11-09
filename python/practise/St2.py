# Given an integer n, print a Python list of squares of all even numbers from 1 to n 
# (inclusive), in increasing order.

# ins = int(input("input: ").strip())
# print([i**2 for i in range(2, ins+1, 2)])  # the user can input as much 



# Problem (Bloom: Remember→Apply):
# Convert space-separated Celsius values to Fahrenheit using map. Round each to 1 decimal and print as a Python list in the same order

# ins = list(map(float, input("input: ").split()))
# print([ round((i*9/5)+32 , 1) for i in ins])



# Problem (Bloom: Understand→Apply):
# Given space-separated words, keep only palindromes (case-sensitive). Print the Python list in input order.

# ins =  input().split()
# print([w for w in ins if w == w[::-1]])


# Problem (Bloom: Apply→Analyze):
# From a list of integers, sum only the odd numbers.

# ins = list(map(int ,input("input a list of no: ").split()))
# sums =  0
# for no in ins:
#     if no % 2 != 0:
#         sums += no
# print(sums)


# Problem (Bloom: Remember→Apply):
# Count vowels (a,e,i,o,u) in a string, case-insensitive.

ins = input().re