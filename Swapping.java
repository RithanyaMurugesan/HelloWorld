import java.util.Scanner;
public class Swapping {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int a=n,b=n1;
		System.out.println("Before Swapping");
		System.out.println("a="+n+" "+"b="+n1);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.print("a="+a+" "+"b="+b);
		sc.close();
	}

}
