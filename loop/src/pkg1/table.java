package pkg1;
//print table of a number
import java.util.Scanner;
public class table {
	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int mul;
		for(int i=1;i<=10;i++)
		{
			mul=a*i;
			System.out.println(a+"*"+i+"="+mul);
		}
		
	}

}
