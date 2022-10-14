import java.util.Scanner;

public class PlaindromeNumber {
  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int temp=n;
	    int r=0;
	    while(temp>0) {
	    	int last = temp%10;
	    	temp /=10;
	    	
	    	r = r*10+last;
	    	
	    }
	    System.out.println(r);
	    if(r==n) {
	    	System.out.println("The number is plaindrome");
	    }else {
	    	System.out.println("The numner is not plaindrome");
	    }
	    
  }
}
