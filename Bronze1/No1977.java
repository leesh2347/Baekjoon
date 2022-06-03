import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int minnum=0;
		int minpow=0;
		while(minpow<a) {
			minnum++;
			minpow=minnum*minnum;
		}
		minpow=minnum*minnum;
		if(minpow>b)
			System.out.println(-1);
		else
		{
			int powsum=0;
			int x=0;
			double y=0;
			for(int i=minpow;i<=b;i++) {
				x=(int) Math.sqrt(i);
				y=Math.sqrt(i);
				if((double)x==y) {
					powsum=powsum+i;
				}
			}
			System.out.println(powsum+"\n"+minpow);
		}
	}

}
