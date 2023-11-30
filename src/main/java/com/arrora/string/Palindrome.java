package com.arrora.string;

public class Palindrome 
{
	
	static void testPalindrome(String st)
	{
		System.out.println("\n Original String given,"+st);
			for(;;)
			{
				// infinate loop.,
			}
	}
	
	static final void testPalindrome1(String st)
	{
		System.out.println("\n Original String given,"+st);
		String rev = "";
			for(int i=st.length(); i>=0; i--)
			{
				rev += st.charAt(i);
			}
			if(st.equalsIgnoreCase(rev))
				System.out.println("Given string,"+st+", is an palindrome");
			else
				System.out.println("Given string,"+st+", is not a palindrome");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\n Palindrome Program,");
		System.out.println("\n-------------\n");
		testPalindrome(" ");
	}

}
