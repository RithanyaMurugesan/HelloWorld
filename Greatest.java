import java.util.Scanner;
public class Greatest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if((n>n1)&&(n>n2))
		{
			System.out.println("The greatest number is : "+n);
		}
		else if((n1>n)&&(n1>n2))
		{
			System.out.println("The greatest number is : "+n1);
		}
		else
		{
			System.out.println("The greatest number is : "+n2);
		}
		sc.close();

	}

}
