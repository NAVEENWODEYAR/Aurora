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
		char rev;
			for(int i=st.length(); i>=0; i--)
			{
				rev = st.charAt(i);
			}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("\n Palindrome Program,");
		System.out.println("\n-------------\n");
		testPalindrome(" ");
	}

}
