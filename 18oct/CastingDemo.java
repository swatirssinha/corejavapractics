*
Program: To understand typecasting
@author: swati sinha
@Date: 18 oct 2022  
*/

//import packages 

import java.util.Scanner;
//declaring a class
class CastingDemo
{
	public static void main(String args[])
	{
        // short is of 2 bytes  -32768 to 32767
		//declaring short data type
		short s1= 22;
		short s2= 11;

		//calculating the sum
		short sum;
		sum= (short)(s1+s2); // by default all the arithmetic operation gives int output

		//printing the sum
		System.out.println("The sum is :"+sum);

		//byte -128 to 127 
		byte b1= 55;
		byte b2 =66;

         byte cal= (byte)(b1+b2);
	     //printing the sum
		System.out.println("The calc is :"+cal);

		double d1= 82.5;
		double d2= 63.3;
		float dd= (float)(d1+d2);
		System.out.println("The dd is :"+dd);

		// type casting omit

		byte b3=8;
		byte b4=9;
		//b3= (byte)(b3+b4);

		b3+=b4; // auto type casting b3 = b3+b4

		System.out.println("The b3  :"+b3);


	}


	// end of main
}
// end of class 
