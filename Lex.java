import java.util.*;
public class Lex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		String m=sc.next();
		String[]a=m.split("");
		TreeSet<String> al=new TreeSet<String>(); 
		for(int i=0;i<a.length;i++)
		{
		  al.add(a[i]);   
		}
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.print(itr.next());  
		  }  
		
	}
