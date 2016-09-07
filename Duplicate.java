import java.util.Scanner;
public class Duplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]!='*')
			{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='*';
				}
				else
				{
					continue;
				}
			}
			}
			else
			{
				continue;
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='*')
			{
				System.out.print(ch[i]);
			}
			else
			{
				continue;
			}
		}
		sc.close();
	}

}
