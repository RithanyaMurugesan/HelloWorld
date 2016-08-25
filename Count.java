import java.util.Scanner;
public class Count {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
        int n=sc.nextInt();
        int n1=sc.nextInt();
        for(int i=n;i<=n1;i++)
        {
        	if(i==1)
        	{
        		continue;
        	}
            else if((i==2)||(i==3)||(i==5)||(i==7)||(i==11))
            {
            	count=count+1;
            }
            else if((i%2!=0)&&(i%3!=0)&&(i%5!=0)&&(i%7!=0)&&(i%11!=0))
            {
            	count=count+1;
            }
            else
            {
            	continue;
            }
            	
        }
        System.out.println(count);

	}

}
