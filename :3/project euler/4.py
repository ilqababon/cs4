import math

max = 0

for i in range(100,1000):
    for j in range(100,1000):
        prod = i * j
        if (str(prod) == str(prod)[::-1] and prod > max):
            max = prod

print(max)