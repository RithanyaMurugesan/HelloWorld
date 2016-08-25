import java.util.*;
public class Maximum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.print("[");
		for(int i=1;i<=3;i++)
		{
			System.out.print(a[n-i]+",");
		}
		System.out.print("]");
		
		}
		
					}
