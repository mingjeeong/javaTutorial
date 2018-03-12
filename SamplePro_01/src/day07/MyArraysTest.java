package day07;

import java.util.Arrays;

import util.MyArrays;

public class MyArraysTest {

	public static void main(String[] args) {

		int[] sungjuk = {90,88,78,99,55};
		//MyArrays.print(sungjuk);
		//MyArrays.sort(sungjuk);
		int[] sortdata = MyArrays.sort(sungjuk);
		MyArrays.print(sungjuk);
		MyArrays.print(sortdata);
		
		
		
	}

}
