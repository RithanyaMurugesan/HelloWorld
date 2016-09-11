import java.util.Scanner;
public class Mul {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char c[]=str.toCharArray();
		int count;
		for(int i=0;i<c.length-1;i++)
		{
			count=0;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]='*';
					count=count+1;
				}
				else
				{
					continue;
				}
			}
			if(count>0)
			{
				c[i]='*';
			}
			else
			{
				continue;
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!='*')
			{
				System.out.print(c[i]);
			}
			else
			{
				continue;
			}
			
		}
		sc.close();

	}

}
