/*
 * lab1part1.java
 * Flavio Leon
 * Jan 26, 2017
 * 
 * 
 * 
 */

import java.io.*;
import java.util.Scanner;


public class lab1part1 
{
public static final int SIZE=100;
public static void main(String[] args) throws IOException
	{
	//declare parallel arrays
	boolean isPassing[] = new boolean[SIZE];
	double scores[] = new double [SIZE];
	int length = 0;
	int counter = 0;
	
	GetData (scores);
	ProcessPass(isPassing,scores,length);
	
	
	
	
	}
public static int GetData (double scores[])
{
		//declare a File object
		File inFile = new File("lab1data.txt");

		//declare scanner object
		Scanner fileInput = new Scanner("lab1data.txt");
		int counter =0;
		//while loop to read until the end of the file
		while(fileInput.hasNext())
		{
			scores[counter] = fileInput.nextDouble();
					//add to counter
					counter++;
		}			
			return counter;
}	
public static void ProcessPass(boolean passing[], double scores[], int length)



{
	for(int i=0; i<length; i++)
				{
				if (scores [i]>60)
					passing[i]=true;
				else
					passing[i] = false;
				
				
				}
	
}
}
