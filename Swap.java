import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char temp;
		char[]a=str.toCharArray();
		if((a.length%2)==0)
		{
		for(int i=0;i<a.length;i=i+2)
		{
		 	System.out.print(a[i+1]);
		 	System.out.print(a[i]);
		}
	}
	}

}
