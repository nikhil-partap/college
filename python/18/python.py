
jars = list(map(int, input().split()))
while len(jars) >= 3:
    popped = False
    for i in range(len(jars) - 2):
        if sum(jars[i:i+3]) > 60:
            jars.pop(i+1)
            popped = True
            break
    if not popped:
        break
print(*jars)
