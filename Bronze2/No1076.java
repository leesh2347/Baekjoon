import java.util.Scanner;
	 import java.util.Arrays;
	 
	public class Main {
		public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
	      long res=0;
	      String[] arr= {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
	      int[] arr2= {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
	      String a=sc.nextLine();
	      String b=sc.nextLine();
	      String c=sc.nextLine();
	      String temp=""+Arrays.asList(arr).indexOf(a)+Arrays.asList(arr).indexOf(b);
	      res=Long.parseLong(temp)*arr2[Arrays.asList(arr).indexOf(c)];
	      
	      System.out.println(res);
		}
	}
