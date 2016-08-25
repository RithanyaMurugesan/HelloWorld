import java.util.Arrays;
import java.util.Scanner;
public class Repeat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		int[]m=new int[n];
		for(i=0;i<n;i++)
		{
			m[i]=sc.nextInt();
		}
		for(i = 0;i<n; i++) {
			  for (j=0; j<i; j++){
			      if (m[i] == m[j])
			       break;
			       }
			      
			     if (i == j){
			     System.out.print(m[i]);
			  }
			 }
		}
		
					}

