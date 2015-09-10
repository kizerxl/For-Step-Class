'''
Created on Sep 8, 2015

@author: Felix
'''

def main():
    #test recursive method 
    print(factorial(5))
    factorial2(5) 
    factorial3(10)
    #print out all values less than 1 billion
    #starting with 1 
    oneBillion(1)
    
#recursive definition 
def factorial(num):
    if num == 0: 
        return 1  
    else:  
      num = num * factorial(num - 1)
    return num


#with for loop, problem 11
def factorial2(num):
    f = 1
    n = 0
    for i in range(num):
        n += 1
        f *= n 
        print(f)
        
#with while loop, problem 18 
def factorial3(num):
    f = 1
    n = 0
    while (n < num):
        n += 1
        f *= n
        print(f)
        
def oneBillion(num):
       result = factorial(num)
       billion = 1000000000
       while result < billion :
           result = factorial(num) 
           if result < billion : 
               print(result)
               num += 1
main()