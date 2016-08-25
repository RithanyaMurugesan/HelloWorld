import java.util.*;
public class Seed {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int p,r=x;
		System.out.print("is a seed of");
		int y=sc.nextInt();
		while(x>0)
		{
		p=x%10;
		r=r*p;
		x=x/10;
		}
		if(r==y)
		{
		System.out.println("find all its seed");
		}
		else
		{
			System.out.print("it doesn't find the seed");
		}
	}
		
