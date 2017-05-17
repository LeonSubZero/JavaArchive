/*
 * lab1part2.java
 * Flavio Leon
 * Jan 26, 2017
 * 
 * 
 * 
 */

import java.io.*;
import java.util.Scanner;



public class lab1part2 
{
	public static void main(String[] args) throws IOException
	{
		
		AssignN(rays[10][10]);
		DrawN(rays[10][10]);
		
		
		
		
		
		
		
		
	}
	
public static void AssignN(String arr[10][10])	
{
/*This function should receive a 2 dimensional array of Strings(10x10) as a parameter and assign the character N
 *  to each element in the first and last columns, and to each element in the diagonal from the upper right to 
 *  the lower left.
 * 
 */
String arr= {{N,"","","","","","","","",N},
			 {N,N,"","","","","","","",N},
			 {N,"",N,"","","","","","",N},
			 {N,"","",N,"","","","","",N},
			 {N,"","","",N,"","","","",N},
			 {N,"","","","",N,"","","",N},
			 {N,"","","","","",N,"","",N},
			 {N,"","","","","","",N,"",N},
			 {N,"","","","","","","",N,N},
			 {N,"","","","","","","","",N}};
	
	
	
}	
public static void DrawN(String arr[10][10])
{
//This function should display the 2 dimensional array so the output looks like an N.
	for (int row = 0; row < 10; row++)
	{
		for (int col = 0; col<10; col++)
		{
			System.out.println(arr[row][col])
		}
			
			
	}
	
	
	
}	

