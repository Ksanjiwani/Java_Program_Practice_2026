package Basic_Java_Concept;

import java.util.Scanner;

public class Input_Practice_Mul {
        public static void main(String args[])
        {
        	int a,b,c;
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter two no a and b : ");
        	a = sc.nextInt();
        	b = sc.nextInt();
        	
        	c = a * b;
        	System.out.println(c);
        }
}
