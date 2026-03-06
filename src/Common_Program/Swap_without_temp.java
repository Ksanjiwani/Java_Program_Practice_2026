package Common_Program;

public class Swap_without_temp {
	public static void main(String args[])
	{
		int no1 = 10,no2=20;
		
		no1 = no1+no2;
		no2 = no1 - no2;
		no1 = no1 - no2;
		System.out.println(no1);
		System.out.println(no2);
	}
	

}
