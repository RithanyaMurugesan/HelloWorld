import java.util.Scanner;
public class Sumpalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,p=0;
		while(n!=0)
		{
			r=n%10;
			p=p+r;
			n=n/10;
		}
		String str1=p+"";
		String s=new StringBuilder(str1).reverse().toString();
		if(s.equals(str1))
		{
			System.out.println("The sum is palindrome");
		}
		else
		{
			System.out.println("The sum is not a palindrome");
		}
		sc.close();
	
	}

}
