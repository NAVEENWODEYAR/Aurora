package com.arrora.array;

import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Arrays;

public class SplitArray 
{
	static void splitArray(int[] arr)
	{
		System.out.println("\n Original size of the array:"+arr.length);
		int[] subArray1 = Arrays.copyOfRange(arr, 0, 3);
	}
	public static void main(String[] args)
	{

	}

}
