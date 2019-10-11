/*************************************************************************
 *  Compilation:  javac LuckySevens.java
 *  Execution:    java LuckySevens 421
 *
 *  @author:Peiqi Tang
 *
 * LuckySevens takes an int as a command-line argument and displays
 * how many digits in the integer number are 7s.  
 *
 * Note: the number can be negative.
 *
 *  % java LuckySevens 3482
 *  0
 *
 *  % java LuckySevens 372777
 *  4
 * 
 *  % java LuckySevens -2378272
 *  2
 *************************************************************************/

public class LuckySevens {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    	int number = Integer.parseInt(args[0]);
    	int length = String.valueOf(number).length();
    	int count = 0;
    	if (number<0){
    		number = number*-1;
    	}
    	for(int i=1;i<=length;i++){
    		int n = number%10;
    		number=number/10;
    		if (n == 7){
    			count++;
    		}
    	}
    	System.out.println(count);
    }

}
