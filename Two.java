import java.util.Scanner;
public class Two {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int count=0,p;
		for(int i=n;i<=n1;i++)
		{
			String s=i+"";
			int m=s.length();
			if(m==1)
			{
				if(i==2)
				{
					count=count+1;
				}
			}
			if(m>1)
			{
				while(i!=0)
				{
					p=0;
					p=i%10;
					if(p==2)
					{
						count=count+1;
						i=i/10;
					}
					else
					{
						i=i/10;
					}
				}
			}
		}
		System.out.println(count);
		

	}

}
