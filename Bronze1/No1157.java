import java.util.Scanner;

public class Main {	
	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String word=s.next();
		String alpcount="";
		int i=0;
		int[] arr=null;
		for(i=0;i<word.length();i++)
		{
			if(alpcount.indexOf(word.substring(i,i+1).toUpperCase())==(-1))
				alpcount=alpcount+word.substring(i,i+1).toUpperCase();
		}
		arr=new int[alpcount.length()];
		for(i=0;i<word.length();i++)
		{
			arr[alpcount.indexOf(word.substring(i,i+1).toUpperCase())]++;
		}
		int ismanyalp=0;
		int max=0;
		int index=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max) {
				max=arr[i];
				index=i;
			}
		}
		for(i=0;i<arr.length;i++)
		{
			if(max==arr[i])
				ismanyalp++;
		}
		
		if(ismanyalp>1)
			System.out.println("?");
		else
			System.out.println(alpcount.substring(index,index+1));
	}
}
