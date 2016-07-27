import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		StringBuffer sb=new StringBuffer(n); 
		sb.reverse();
		System.out.println(sb);
	}

}
