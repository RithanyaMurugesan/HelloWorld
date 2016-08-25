import java.util.*;
public class Height {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]a=new int[50];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[4]);
		System.out.print("Enter your choice");
		int n=sc.nextInt();
		System.out.print(a[n]);
		}
		
