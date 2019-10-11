/*************************************************************************
 *  Compilation:  javac WCS111FM.java
 *  Execution:    java WCS111FM 53
 *
 *  The program takes the number of hours the listener spends
 *  programming as an int argument. Based on the number of hours spent
 *  programming, display the listener prize
 *
 *  @author:Peiqi Tang
 *
 *  % java WCS111FM 3
 *  T-shirt
 *
 *  % java WCS111FM 9
 *  Laptop
 *  TV
 * 
 *  % java WCS111FM 0
 *  Nothing
 *************************************************************************/

public class WCS111FM {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    	int hours = Integer.parseInt(args[0]);
    	if(hours==0){
    		System.out.println("Nothing");
    	}if(hours>=1 && hours<=5){
    		System.out.println("T-shirt");
    	}else if(hours>=6 && hours<=400){
    		if(hours%10 == 9){
    			System.out.println("Laptop");
    		}if(hours%2 == 0){
    			System.out.println("Hat");
    		}if(hours%3 == 0)
    			System.out.println("TV");
    	}else if (hours > 400){
    		System.out.println("Cat");
    	}
    }

}
