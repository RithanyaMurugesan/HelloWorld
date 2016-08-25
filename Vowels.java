import java.util.Scanner;
public class Vowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int j=0;
		char[]b=new char[str.length()];
		char[]a=str.toCharArray();
		int n=a.length;
		for(int i=n-1;i>=0;i--)
		{
			b[j]=a[i];
			System.out.print(b[j]);
			j=j+1;
		}
		System.out.println("");
		for(int i=0;i<b.length;i++)
		{
			if((b[i]=='a')||(b[i]=='e')||(b[i]=='i')||(b[i]=='o')||(b[i]=='u'))
			{
				continue;
			}
			else
			{
				System.out.print(b[i]);
			}
		}
	}
}
