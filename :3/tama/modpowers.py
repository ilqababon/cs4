import math

mod = 10**9 + 7
n = 7**7
a = n//2
b = n - n//2

#print((((21**a)*(5**b))+((21**b)*(5**a)))%mod)
print(((105**a)*(26))%mod)

temp = 105**411771 % mod
print(temp * 26 % mod)

#look i was too lazy to figure out the logic to just PUT IT IN A WHILE LOOP OK IM DUMB
#temp = 105**10 % mod
#temp2 = temp**10 % mod
#temp3 = temp2**10 % mod
#temp4 = temp3**10 % mod
#temp5 = temp4**10 % mod
#temp6 = temp5**10 % mod
#temp7 = temp6**10 % mod
#temp8 = temp7**10 % mod
#temp9 = temp8**10 % mod
#temp10 = temp9**10 % mod
#temp11 = temp10**10 % mod
#temp12 = temp11**10 % mod
#temp13 = temp12**10 % mod
#temp14 = temp13**10 % mod
#temp15 = temp14**10 % mod
#temp16 = temp15**10 % mod
#temp17 = temp16**10 % mod
#temp18 = temp17**5 % mod
#print(2 * temp18 % mod)