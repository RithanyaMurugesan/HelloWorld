import java.util.Scanner;
public class Amstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int m=n;
		int r,p=0;
		while(n!=0)
		{
			r=n%10;
			p=(int) (p+Math.pow(r,3));
			n=n/10;
		}
		if(m==p)
		{
			System.out.println("It is an amstrong number");
		}
		else
		{
			System.out.println("It is not an amstrong number");
		}
		sc.close();

	}

}
