'''
Created on Sep 10, 2015

@author: Felix
'''
''' 
    Given a list of mixed data types, give me the sum of all
    of the ints in the list. Create a new list with all of the 
    strings only. Have the user create a list 
'''
def outputInts(mylist):
    realnumbers = []
    idx = 0 
    while idx < len(mylist) :
        try:
            realnumbers.append( int(mylist[idx]) )
            idx += 1      
        except:
            idx += 1  #increment by one to test the next element
    return realnumbers  
 
def outputStrings(mylist):
    numbers = outputInts(mylist)
    numberStrings = []
    for n in numbers:
        numberStrings.append(str(n))
    for n in numberStrings: 
        mylist.remove(n)
    
    return mylist 

def getCorrectInput(userInput):
    while (True):
        userInput = input("Invalid response. Please enter yes (y) or no (n)")
        if (userInput == "yes" or userInput == "y" or userInput == "no" or userInput == "n"):
            break

        
def challenge1():
    mylist = []
    mysum = 0
    print("We are going to make our very own list. Let's begin")
    response = ""
    while (True):
        entry = input("Please enter a value:")
        entry = entry.replace(" ","") # remove white space if any 
        mylist.append(entry)
        response = input("Enter another value?(y/n):")
        if (response.lower() == "n" or response.lower() =="no"): 
            if (len(mylist) < 3):
                print("You need to enter at least 3 values")
                print("You have "+str(len(mylist))+" values")
            else:
                break 
        elif (response.lower() == "y" or response.lower() == "yes"):
            continue
        else: 
            getCorrectInput(response)
            
                        
    print("Your array is "+str(mylist))
     
    #get sum of ints 
    allNumbers = outputInts(mylist) 
    #get all strings 
    allStrings = outputStrings(mylist)
    for n in allNumbers:
        mysum += n
     
    print("The sum of your number inputs is "+str(mysum))
    print("An array of the remaining entries is "+str(allStrings))
#     
    
challenge1()
        
    
    
    
    
        



