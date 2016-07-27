import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println(fact);
		}
		else if(n>0)
		{
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
	else
	{
		System.out.println("0");	
	}
	}

}
