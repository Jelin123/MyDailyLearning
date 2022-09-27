import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
      int num;
      System.out.println("Enter a Number");
      
      Scanner scan = new Scanner(System.in);
      num = scan.nextInt();
      
      if(num%2==0)
     System.out.println("Entered num is even" );
      else
    	  System.out.println("Entered num is odd");
	}

}
