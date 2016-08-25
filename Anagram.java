import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,r=0;
		String[]str=new String[n];
		int[]n1=new int[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		for(int i=0;i<str.length;i++)
		{
		count=0;
		char[]a=str[i].toCharArray();
		for(int j=0;j<a.length;j++)
		{
			int a1=(int)a[j];
			count=count+a1;
		}
		n1[r]=count;
		r=r+1;
		}
		for(int m=0;m<n1.length;m++)
		{
			for(int j=0+m;j<n1.length-1;j++)
			{
			if(n1[m]==n1[j+1])
			{
				System.out.print(str[m]+",");
				System.out.print(str[j+1]);
				System.out.println("");
			}
			else
			{
				continue;
			}
			j=j+1;
		}
		}
			}
}
