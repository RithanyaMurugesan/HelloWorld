import java.util.*;
public class Panagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int i=0;
		int count=0;
		for(int n=65;n<=90;n++)
		{
			i=i+n;
		}
		char []a=s1.toCharArray();
		for(int j=0;j<a.length;j++)
		{
			int p=(int)a[j];
			count=count+p;
		}
		if((i==count)||(i<count))
		{
			System.out.println("It is a panagram");
		}
		else
		{
			System.out.println("It is not a panagram");
		}
			}
		
					}

