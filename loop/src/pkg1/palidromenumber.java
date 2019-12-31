package pkg1;
//To check whether a number is a palindrome or not first
//we reverse it and then compare the number obtained with the original number, 
//if both are same then the number is palindrome otherwise not.
import java.util.Scanner;

public class palidromenumber 
{
	public static void main(String[] args) {
		Scanner sa=new Scanner(System.in);
		System.out.println("enter number");
		int num=sa.nextInt();
		int oldnum=num;
		int rev=0;
		while(num>0)
		{
			
			
			
			int rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		}
		if(rev==oldnum)
		{
			System.out.println("number is palidrom");
			
		}
		else {
			System.out.println("not palidrome");
		}
	}
	

}
