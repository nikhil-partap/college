sums = 0
for i in range(10):
    sums += i

print(sums)

sums = 0
for i in range(0,11):
    if i%2 == 0:
        sums += i
print(sums)


sums = 0
for i in range(0,11,1):
    sums += i
print(sums)


sums = 0 
for i in range(1,11):
    if i%2 ==1:
        sums += i
print(sums)


sums = 0
for i in range (1,11,1):
    sums += i
print(sums)





user = int(input("Enter the no"))
sumeven =0
sumodd = 0
for i in range (user):
    if i%2 == 0 :
        sumeven += i
    else :
        sumodd += i

print (sumeven , sumodd)



