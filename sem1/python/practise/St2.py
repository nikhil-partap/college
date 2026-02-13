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

# ins = input()
# vowels = set("aeiou")
# print(sum(1 for ch in ins.lower() if ch in vowels))

# Problem (Bloom: Understand→Analyze):
# Given a string, count the frequency of all non-space characters. Output a list of (char, count) pairs sorted by char (ascending) to ensure determinism.
# import re
# from collections import Counter
# ins =  input()
# ins = re.sub(r"[^a-zA-Z]+", "" , ins)
# chr_count = Counter(ins)
# print(sorted(chr_count.items()))


# Print characters of a string without duplicates, preserving the first appearance order
# ins = input()

# seen , out = set(), []
# for ch in ins:
#     if ch not in seen:
#         seen.add(ch)
#         out.append(ch)
# print("".join(out))


# # Given a tuple of integers, swap the first occurrence positions of the minimum and maximum values
# # , and print the resulting tuple.
# ins = tuple(map(int, input().split()))

# i , j = ins.index(min(ins)) , ins.index(max(ins))

# ins = list(ins)
# ins[i] , ins[j] = ins[j] , ins[i]

# print(tuple(ins))


# Problem (Bloom: Understand→Apply):
# Print a sorted Python list of unique lowercased words from a sentence.

# ins = input().lower().split()
# print(sorted(set(ins)))


# Given two lines of integers, print the sorted intersection as a Python list.
ins1 = list(map(int, input().split()))
ins2 = list(map(int, input().split()))
out = []
for no in ins2:
    if no in ins1:
        out.append(no)
print(out)