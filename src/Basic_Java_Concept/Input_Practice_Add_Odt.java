package Basic_Java_Concept;

import java.util.Scanner;

public class Input_Practice_Add_Odt {
	public static void main(String args[])
	{
		float a,b,c;
		System.out.println("Enter the two no:" );
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = a*b;
		System.out.println(c);
		
		
		double p,q,r;
		System.out.println("Enter the two no:" );
		Scanner sc1 = new Scanner(System.in);
		p = sc1.nextDouble();
		q = sc1.nextDouble();
		r = p*q;
		System.out.println(r);
		
		String name;
		System.out.println("Enter the Name : ");
		Scanner sc2 = new Scanner(System.in);
		name = sc2.next();
		System.out.println(name);
		
		String ch;
		System.out.println("Enter the character : ");
		Scanner sc3 = new Scanner(System.in);
		ch = sc3.next();
		System.out.println(ch);
		
		String sentence;
		System.out.println("Enter the sentence");
		Scanner sc4 = new Scanner(System.in);
		sentence = sc4.nextLine();
		System.out.println(sentence);

}
}

