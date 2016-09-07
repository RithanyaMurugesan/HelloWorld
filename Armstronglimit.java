import java.util.Scanner;
public class Armstronglimit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int r,p;
		for(int i=n;i<=n1;i++)
		{
			p=0;
			int m=i;
	    	while(m!=0)
			{
				r=m%10;
				p=(int) (p+Math.pow(r,3));
				m=m/10;	
			}
			if(i==p)
			{
				System.out.println(i);
			}
			else
			{
				continue;
			}
		}
		
		sc.close();

	}

}
