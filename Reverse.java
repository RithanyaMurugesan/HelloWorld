import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>=0)
		{
		String s=String.valueOf(n);
		StringBuffer sb=new StringBuffer(s); 
		sb.reverse();
		System.out.println(sb);
	}
		else
		{
			System.out.println("0");
		}
	}

}
