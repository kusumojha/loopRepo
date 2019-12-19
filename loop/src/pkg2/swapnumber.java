package pkg2;
import java.util.Scanner;
//swapping of two number with help of third number 
public class swapnumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter two number for swapping");
		int a=s.nextInt();
		int b=s.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("swapped number is"+a+" "+b);
		
		
	}

}
