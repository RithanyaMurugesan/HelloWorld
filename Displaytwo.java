import java.util.Scanner;
public class Displaytwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int count=0,p,r;
		for(int i=n;i<=n1;i++)
		{
			String s=i+"";
			int m=s.length();
			if(m==1)
			{
				r=i;
				if(r==2)
				{
					count=count+1;
				}
			}
			if(m>1)
			{
				r=i;
				while(r!=0)
				{
					p=r%10;
					if(p==2)
					{
						count=count+1;
						r=r/10;
					}
					else
					{
						r=r/10;
					}
				}
			}
		}
		System.out.println(count);
		sc.close();

	}

}
