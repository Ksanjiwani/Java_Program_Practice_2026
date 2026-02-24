package Basic_Java_Concept;

import java.util.Scanner;

public class Input_practice_Add {
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Number a and b : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a + b;
		System.out.println(c);
		
	}

}
