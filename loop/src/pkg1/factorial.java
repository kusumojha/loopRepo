package pkg1;
//factorial of a number
import java.util.Scanner;
public class factorial {
public static void main(String[] args) {
	System.out.println("enter number");
	Scanner s=new Scanner(System.in);
	int number=s.nextInt();
	int fact=1;
	for(int i=1;i<=number;i++)
	{
		fact=fact*i;
			
	}
	System.out.println("factorial of "+number+"is "+fact);
}
}
