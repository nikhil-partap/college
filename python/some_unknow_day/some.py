# python has a inbuilt module that is used to make random nos 
# 

import random
print(random.random())


# seed()
# random.seed(10)
print(random.random())


# random()- float - o -1

# randrange(start, stop, step)
print(random.randrange(5, 10))


# randint(start, stop)
print(random.randint(5, 10))

# choice(my_list)
my_list = [1,2,3,4,6,6]
print(random.choice(my_list))

# choices(seq, weights=None, cum_weights=None, k=1)

seq = ['apple', 'banana', 'cherry']

# Example with weights
weights = [10, 1, 1]  # 'apple' is 10x more likely
result = random.choices(seq, weights=weights, k=5)
print("With weights:", result)

# Example with cumulative weights
cum_weights = [10, 11, 12]  # interpreted as cumulative sums
result_cum = random.choices(seq, cum_weights=cum_weights, k=5)
print("With cumulative weights:", result_cum)

# Example without weights
result_no_weights = random.choices(seq, k=5)
print("Without weights:", result_no_weights)

#  k - If you write random.choices(seq, k=3), you will get a list of 3 items chosen randomly from seq.






# shuffle()
lst = [1, 2, 3, 4]
random.shuffle(lst)
print(lst)  # Output is a randomly shuffled version, e.g. [3, 1, 4, 2]



# sample(seq, k)
lst = [1, 2, 3, 4, 5]
result = random.sample(lst, k=3)
print(result)  # Output might be [2, 5, 3] (any 3, but never duplicate values)


# uniform()
value = random.uniform(1.5, 7.5)
print(value)  # Output will be a float between 1.5 and 7.5, e.g., 4.3289





# min ,  max 
x = min(6,7,8)
y = max(6,7,8)

# x = abs(-7, 89)
# print(x)

x =  pow(4,3)   # 4^3
print(x)


import math

# math.ceil()
num = 2.3
result = math.ceil(num)
print(result)  # Output: 3


# math.floor()
num2 = -2.7
result2 = math.ceil(num2)
print(result2)  # Output: -2


print(x,y)

x = math.pi
print(x)


# A module is a file containing Python code (functions, classes, variables) that you want to include in your application.

# Modules help organize code and make it reusable.



import shit
shit.hello_shit("nimit")




import platform
x =  platform.system()
print(x)

x = dir(platform)
print(x)


# the key function of python for working with  
