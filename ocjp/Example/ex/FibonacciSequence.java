package ex;

public class FibonacciSequence {
	 public static void main(String[] args) 
	 {
		 int first_term = 0;
		 int second_term = 1;

	     for (int i = 0; i < 10; i++) 
	     {
	    	 System.out.print(first_term + ", ");
	    	 int next_term = first_term + second_term;
	         first_term = second_term;
	         second_term = next_term;
	     }
	 }       
}
