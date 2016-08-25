import java.util.*;
public class Minimum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n1=sc.next();
		int r=n1.length();
		int j=0,p;
		int[]a=new int[r];
		int n=Integer.parseInt(n1); 
		while(n>0)
		{
		p=n%10;
		a[j]=p;
		j=j+1;
		n=n/10;
		}
		Arrays.sort(a);
		System.out.print("Enter your choice to delete");
		int m1=sc.nextInt();
		int m=a.length-m1;
		for(int i=0;i<m;i++)
		{
		System.out.print(a[i]);
		}
	}
		
					}

