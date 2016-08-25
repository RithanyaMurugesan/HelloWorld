import java.util.Scanner;
public class Rr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String st[]=str.split(" ");
        for(int i=0;i<st.length;i++)
        {
            String s1=st[i].substring(0,1).toUpperCase()+st[i].substring(1);
            System.out.print(s1+" ");
        }

	}

}
