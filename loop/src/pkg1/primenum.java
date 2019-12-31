package pkg1;
//prime number
import java.util.Scanner;

public class primenum {
	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int flag=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println("number is not prime"+num);
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		{
			System.out.println("number is prime"+num);
		}
	}

}
