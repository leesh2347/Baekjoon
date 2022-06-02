import java.util.Scanner;

public class Main {
	
	public static int rev(int num) {
		int res=0;
		int nownum=0;
		int len=Integer.toString(num).length();
		for(int i=0;i<len;i++) {
			nownum=(int) ((num/(Math.pow(10, i)))%10);
			res=(int) (res+nownum*Math.pow(10, (len-i-1)));
		}
		
		return res;
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=rev(a)+rev(b);
		System.out.println(rev(sum));
	}

}
