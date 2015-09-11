'''
Created on Sep 11, 2015

@author: Felix
'''
#Program outputs a leap year 

year = int( input("Enter a year: ") )
if( year % 4 == 0 or (year % 100 != 0 and year % 400) ):
    print("Leap Year")
else:
    print("Not a leap Year")

            
        