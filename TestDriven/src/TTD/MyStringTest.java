package TTD;

import static org.junit.Assert.*;


import org.junit.Test;

public class MyStringTest {

	
	

	//This test checks to see if both uppercase and lowercase vowels are returned
	@Test
	public void testGetVowels() 
	{
		MyString Test=new MyString();
		Test.setString("APPLESAUCE IS YUMMY"+"applesauce is yummy");
		assertEquals("must be all the vowels in the string","AEAUEIUaeaueiu",Test.getVowels());
	
	}
	
	//This test checks to see if an integer number in the string causes the method to fail
	@Test
	public void testGetVowels2() 
	{
		MyString Test=new MyString();
		Test.setString("5 Apples");
		assertEquals("the 5 should be ignored and result should be Ae","Ae",Test.getVowels());
	
	}

	@Test(expected=StringIndexOutOfBoundsException.class)
	//This test will test for an an excpetion that was not caught in the method
	public void testGetSubstring() 
	{
		MyString Test=  new MyString();
		Test.setString("Hello Today is Monday");
		Test.getSubstring(1, 100);
	}
	
	@Test
	//This test will produce a substring 
	public void testGetSubstring2() 
	{
		MyString Test=  new MyString();
		Test.setString("Hello Today is Monday");
		assertEquals("The substring should be Today is","Today is",Test.getSubstring(6, 14));
	}

	@Test
	// this test will attempt to find the index of a character which does not exist in the string
	public void testIndexOf()
	{
		MyString Test=new MyString();
		Test.setString("Computer Science");
	    assertEquals("The result should be 0",0,Test.indexOf('z'));
		
		
	}
	
	@Test(expected=NullPointerException.class)
	// this test will attempt to find the index of a character which does not exist in the string
	public void testIndexOf2()
	{
		MyString Test=new MyString();
		Test.indexOf('z');
			
	}
	
	
	@Test
	// this test will check that the first character returns an index of 1
	public void testIndexOf3()
	{
		MyString Test=new MyString();
		Test.setString("Computer Science");
	    assertEquals("The result should be 1",1,Test.indexOf('C'));
		
		
	}
	
	@Test(expected=NullPointerException.class)
	public void setCharArray()
	//This test will check for a null pointer exception if CharArray is reference before a string is set
	{
		MyString Test=new MyString();
		Test.setCharArray();
		
		
	}
	@Test // This test will ensure that the string set is equal to the set CharArray
	public void setCharArray2()
	{
		MyString Test=new MyString();
		Test.setString("Today");
		Test.setCharArray();
		assertEquals("Both objects should be equal",Test.getString(),Test.GetCharArrayAsString());
	
	}
	
	
	
	
	@Test(expected=NullPointerException.class)
	// This test will check for a null pointer exception if a character is removed from a non initialized CharArray
	public void testRemoveChar()
	{
		MyString Test=new MyString();
		Test.setString("Computer Science");		
		Test.removeChar('e');
	}

	@Test
	// this test will check if the function removes all occurrences  of a certain character
	public void testRemoveChar2() 
	{
		MyString Test=new MyString();
		Test.setString("Computer Science");		
		Test.setCharArray();
		Test.removeChar('e');
		assertEquals("The result should be Computr Scinc","Computr Scinc",Test.getString());
		
	}
	
	

	@Test 
	// this test will check to see if a string is successfully inverted
	public void testInvert() 
	{
		MyString Test=new MyString();
		Test.setString("Reverse");		
		Test.setCharArray();
		Test.invert();
		assertEquals("The result should be Computr Scinc","esreveR",Test.getString());

	}
	@Test(expected=NullPointerException.class)
	//this test will throw a null pointer exception if Test.invert is called before the array is initialized
	public void testInvert2() {
		MyString Test=new MyString();
		Test.setString("EXCEPTION");
		Test.invert();
	}


}
