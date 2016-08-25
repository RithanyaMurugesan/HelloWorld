import java.util.*;
public class Days {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s1[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]==str)
			{
				if(i==0)
				{
					for(int j=0;j<7;j=j+2)
					{
			        System.out.print(s1[j]+",");	
			}}
				else if(i==1)
					{
						for(int j=0;j<7;j=j+2)
						{
				        System.out.print(s1[j]+",");
				}
						System.out.print(s1[i-1]);
				}
				else if(i==2)
					{
						for(int j=0;j<7;j=j+2)
						{
				        System.out.print(s1[j]+",");
				}
						System.out.print(s1[i-1]);
				}
				else if(i==3)
				{
					for(int j=0;j<7;j=j+2)
					{
			        System.out.print(s1[j]+",");
			}
					System.out.print(s1[i-i]+",");
					System.out.print(s1[i-1]);
			}
				else if(i==4)
				{
					System.out.print(s1[i]+",");
					System.out.print(s1[i+1]+",");
			        System.out.print(s1[i-3]+",");
			        System.out.print(s1[i-1]);
			}
				else if(i==5)
				{
					System.out.print(s1[i]+",");
					for(int j=0;j<5;j=j+2)
					{
					System.out.print(s1[j]+",");
			}	
			}
				else if(i==6)
				{
					System.out.print(s1[i]+",");
					for(int j=1;j<6;j=j+2)
					{
					System.out.print(s1[j]+",");
			}	
			}
			}
				else
				{
					continue;
				}
		}
		
	}
		
					}

