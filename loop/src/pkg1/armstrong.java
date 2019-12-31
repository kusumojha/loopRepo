package pkg1;
//not correct
import java.util.Scanner;

public class armstrong {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	int n=s.nextInt();
	int result=0;
	int oldnum=n;
	while(n>0)
	{
		int rem=n%10;
		result=result=rem*rem*rem;
		n=n/10;
	}
	if(result==oldnum)
	{
		System.out.println("number is armstrong");
		
	}
	else {
		System.out.println("not armstrong");
	}	
}
}
