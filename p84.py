def multiply(x):
    r = 1
    while x>0:
        r *= x%10
        x//=10
    return(r)

def presist(x):
    r = 0
    while x>=10:
        x = multiply(x)
        r+=1
    return(r)




x = eval(input())
print(presist(x))


