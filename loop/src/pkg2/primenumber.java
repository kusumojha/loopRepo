package pkg2;
import java.util.Scanner;
//prime or not prime
//wrong program
public class primenumber {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int number=s.nextInt();
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				System.out.println("number is not prime");
				break;
			}
			else
			{
				System.out.println(" prime");
				break;
			}
		}
	}
	

}
