import java.util.Scanner;

public class Main {	
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=0;
		a=s.nextInt();
		int isyun=0;
		if(a%4==0&&(a%100!=0||a%400==0))
			isyun=1;
		System.out.println(isyun);
	}
}
