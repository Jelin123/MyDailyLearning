
public class SwapTwoNumbers {

	public static void main(String[] args) {
      
		float first=3.4f, second = 6.7f;
		System.out.println("*******Before Swap***********");
	    System.out.println("First number = "+first);
	    System.out.println("Second number "+second);
	    
	    float temp = first;
	    first = second;
	    second = temp;
	    
	    System.out.println("*******After Swap***************");
	    System.out.println("First Number is"+first);
	    System.out.println("Second Number is"+second);
	    
	
	}

}
