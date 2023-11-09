package com.arrora.array;

import java.util.Arrays;

public class SplitArray
{
	// subArray from original array.,
	static void splitArray(int[] arr)
	{
		System.out.println("\n Original size of the array:"+arr.length);
		int[] subArray = Arrays.copyOfRange(arr, 0, 5);
	}

	public static void main(String[] args)
	{
		splitArray(new int[] {1,2,3,4,5,6,7,8,9,10});
	}

}
