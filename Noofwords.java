import java.util.Scanner;
public class Noofwords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=str.split(" ");
		System.out.println(s.length);
		sc.close();

	}

}
