package pkg2;

//prime number between 5 to 50

public class prime5to50
{
	public static void main(String[] args) {
		
	
	for(int num=5;num<=50;num++) 
	{
	int flag=0;
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			
			flag=1;
			break;
		}
		
	}
	if(flag==0)
	{
		System.out.println("prime number between 5 to 50 is"+num);
	}
	}	

}
}
