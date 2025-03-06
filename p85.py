def fib(n):
  if n == 0 or n == 1:
    return n
  else:
    return fib(n-1) + fib(n-2)

n =  eval(input())
result = fib(n)
print("The", n, "th Fibonacci number is:", result)