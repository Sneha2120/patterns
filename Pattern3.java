package com.anpc8323.day3;

public class Pattern3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}