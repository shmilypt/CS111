/*************************************************************************
 *  Compilation:  javac Gas.java
 *  Execution:    java Gas 3.40 15.0 true
 *
 *  @author:Peiqi Tang
 *
 * The program Gas computes and displays the price a
 * person will pay for gas at the gas station.
 *
 *  % java Gas 3.40 15.0 false
 *  56.1
 *
 *  % java Gas 3.40 15.0 true
 *  51.0
 *
 *************************************************************************/

public class Gas {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    Double price = Double.parseDouble(args[0]);
    Double gallons = Double.parseDouble(args[1]);
    Boolean card = Boolean.parseBoolean(args[2]); 
    if (price<=0 || gallons<=0){
    	System.out.println("Illegal input");
    }else if(card == false){
    	System.out.println(price*gallons*1.1);
    }else if(card == true){
    	System.out.println(price*gallons);
    
    }


    }
}
