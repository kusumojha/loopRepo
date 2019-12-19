package pkg2;
//swapping of two number without using third number
import java.util.Scanner;

public class swapno2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter two number");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println("number before swapping"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("number after swapping"+a+" "+b);
	}

}
