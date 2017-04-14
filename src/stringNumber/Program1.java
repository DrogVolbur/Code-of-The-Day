package stringNumber;
import java.math.BigInteger;
import java.util.Scanner;
public class Program1 {
      public static void main(String[] args) {
    	int a[]=new int[10],k=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your String:");
		String s=in.next();
		int j=s.length();
		BigInteger i1=new BigInteger(s);
		BigInteger b1=new BigInteger("10");
		while(k<=j)
		{
		    BigInteger y=(i1.remainder(b1));
			for(int r=0;r<10;r++)
				if(y.intValue()==r)
				{
					a[r]+=1;
					break;
				}
			i1=i1.divide(b1);
			k=k+1;
		}
		for(int r=0;r<10;r++)
			System.out.println(r+" "+a[r]);
		in.close();
	}

}
