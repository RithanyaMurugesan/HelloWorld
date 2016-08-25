import java.util.*;
public class Stringrev {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[]s1=new String[n];
		for(int i=0;i<n;i++)
		{
			s1[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			StringBuffer sb=new StringBuffer(s1[i]);
			sb.reverse();
			System.out.print(sb+" ");
		}
		}
		
