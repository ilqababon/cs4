import math

n1 = 10
n2 = 10**4
n3 = 3**15
n4 = 2023 * 10**14
mod = 10**6+37

def sum(n):
    return (((n*(n+1)*(2*n+1))//6) % mod)

print(sum(n1))
print(sum(n2))
print(sum(n3))
print(sum(n4))