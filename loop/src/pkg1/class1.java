package pkg1;
import java.util.Scanner;

public class class1 
{
 public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter marks");
	int marks=s.nextInt();
	
	if((marks>=0)&&(marks<=33))
	{
		System.out.println("fail");
	}
	else if((marks>33)&&(marks<=59))
	{
		System.out.println("pass");
	}
	else if((marks>=60)&&(marks<=79))
	{
		System.out.println("first division");
	}
	else if((marks>=80)&&(marks<=100))
	{
		System.out.println("merit");
	}
	else
	{
		System.out.println("enter correct marks");
	}
}
}
