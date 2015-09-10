'''
Created on Sep 8, 2015

@author: Felix
'''

def toFahrenheit(temp):
    # Fahrenheit = Celsius * 1.8 + 32 
    return float(temp) * 1.8 + 32 

def main():
    celsiusTemp = input("Please enter a temperature (in Celsius):")
    fahrenheitTemp = toFahrenheit(celsiusTemp)
    print ("Your temperature in Celsius:")
    print(celsiusTemp)
    print ("The result in Fahrenheit is:")
    print(fahrenheitTemp)

    
main()




