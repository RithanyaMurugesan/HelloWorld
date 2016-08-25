import java.util.*;
public class Vowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.next();
		for(int i=0;i<x.length();i++)
		{
			char c=x.charAt(i);
		    if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Constant");
		}
		}
	}
