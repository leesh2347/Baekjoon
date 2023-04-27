import java.util.Scanner;
	 import java.math.BigInteger;
	 
	public class Main {
		public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		int i=0;
		BigInteger s1=new BigInteger("0");
		int n1=sc.nextInt();
		for(i=0;i<n1;i++)
			s1=s1.add(sc.nextBigInteger());
		BigInteger s2=new BigInteger("0");
		int n2=sc.nextInt();
		for(i=0;i<n2;i++)
			s2=s2.add(sc.nextBigInteger());
		BigInteger s3=new BigInteger("0");
		int n3=sc.nextInt();
		for(i=0;i<n3;i++)
			s3=s3.add(sc.nextBigInteger());
		if(s1.compareTo(BigInteger.ZERO) == -1)
			System.out.println("-");
		else if(s1.compareTo(BigInteger.ZERO) == 1)
			System.out.println("+");
		else
			System.out.println("0");
		if(s2.compareTo(BigInteger.ZERO) == -1)
			System.out.println("-");
		else if(s2.compareTo(BigInteger.ZERO) == 1)
			System.out.println("+");
		else
			System.out.println("0");
		if(s3.compareTo(BigInteger.ZERO) == -1)
			System.out.println("-");
		else if(s3.compareTo(BigInteger.ZERO) == 1)
			System.out.println("+");
		else
			System.out.println("0");
		}
	}
