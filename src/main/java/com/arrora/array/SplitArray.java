package com.arrora.array;

import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Arrays;

public class SplitArray 
{
	// subarray from original array..
	static void splitArray(int[] arr)
	{
		System.out.println("\n Original size of the array:"+arr.length);
		int[] subArray1 = Arrays.copyOfRange(arr, 0, 3);
	}
	
	public static void main(String[] args)
	{
		splitArray(new int[] {1,2,3,4,5,6,7,8,9});
	}

}
