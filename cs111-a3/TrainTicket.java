/*************************************************************************
 *  Compilation:  javac TrainTicket.java
 *  Execution:    java TrainTicket
 *
 *  @author:Peiqi Tang
 *
 * The program TrainTicket takes two command-line arguments: an int
 * referring to the persons age and a boolean referring to whether or
 * not the ticket was bought at the train station (true for a ticket
 * bought at the train station). The program computes and displays the
 * ticket price the person needs to pay for the train ride.
 *
 *  % java TrainTicket 23.0 true
 *  13.20
 *
 *  % java TrainTicket 23.0 false
 *  15.84
 * 
 *  % java TrainTicket 230 false
 *  Illegal input
 *
 *************************************************************************/

public class TrainTicket {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    	int age = Integer.parseInt(args[0]);
    	Boolean station = Boolean.parseBoolean(args[1]);
    	if (age<0 || age>120){
    		System.out.println("Illegal input");
    	}else if (age<7){
    		System.out.println(0.0);
    	}else if (station == true){
    		if(age>65){
    		System.out.println(7.5);	
    		}else{
    		System.out.println(13.2);
    		}
    	}else if (station == false){  //1.2
    		if(age>65){
    		System.out.println(7.5*1.2);	
    		}else{
    		System.out.println(13.2*1.2);
    		}
    		
    	} 
    }

}
