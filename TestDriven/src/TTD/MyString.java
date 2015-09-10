package TTD;

public class MyString implements MyStringInterface  {
	private String str;
	private char CharArray[];
	
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      
	}
	
	 public void setString(String str)
	 {
		 this.str=str;
		
	 }


	public String getString() {
		
		return str;
	}

	@Override
	public String getVowels()
	{
		String Vowels="";

		char lowercase;
		String lowercasestr; // converts the str to all lower case
		lowercasestr=str.toLowerCase();
		
		
			for(int i=0;i<=str.length()-1;i++)
			{
				
				lowercase=lowercasestr.charAt(i);
				
				if(lowercase=='a'||lowercase=='e'||lowercase=='i'||lowercase=='o'||lowercase=='u')
				{
					Vowels=Vowels+str.charAt(i); //appends the vowel string if a vowel is find, uses original str in order to preserve punctuation
				}
				
			}
				
		
		
		 return Vowels;
	}

	
	public String getSubstring(int start, int end) 
	{
		return str.substring(start, end);
		
	}


	public int indexOf(char c) 
	{
				
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==c)
			{
			  
			  
			  return i+1;
		    }
		   	
	    }
		return 0;
	
	}
	
	 public void setCharArray()
	 {
		 CharArray=new char[str.length()];
		 for(int i=0; i<str.length();i++)
		 {
			 CharArray[i]=str.charAt(i);
		 }
		 
		 
		 
	 }
	
	 public String GetCharArrayAsString()
	 {
		 String str2=new String(CharArray);
		 return str2;
	 }
	 
	 
	public void removeChar(char c) 
	{
		str="";
		
		for(int i=0; i<CharArray.length;i++)
		{
			if(c!=CharArray[i])
			{
				str=str+CharArray[i];
			}
			
		}
		
		
	}

	
	public void invert() 
	{
		str="";
		int CharArrayLength=CharArray.length;
		for(int i=CharArrayLength-1;i>=0;i--)
		{
			str=str+CharArray[i];
		}
		
	}

}
