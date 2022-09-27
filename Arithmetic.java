package com.src;
import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
	//creating scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		//getting input value from user 
		
	System.out.println("Enter first number");
   int num1 = sc.nextInt();
   System.out.println("Enter second number");
   int num2 = sc.nextInt();
   //writting operation
   int add,sub,mul,div,mod;
   add=num1+num2;
   sub=num1-num2;
   mul=num1*num2;
   div=num1/num2;
   mod=num1%num2;
   //getting resultout

   System.out.println("Addition is:"+add);
   System.out.println("Subtraction is:"+sub);
   System.out.println("Multiplication is:"+mul);
   System.out.println("Division is:"+div);
   System.out.println("Modulation is:"+mod);
	
	}
	
}