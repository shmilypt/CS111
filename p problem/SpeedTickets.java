public class SpeedTickets {

    public static void main(String[] args) {
    Double speed = Double.parseDouble(args[0]);
    if (speed < 0){
        System.out.println("Error");
    }else if (speed<= 60){
    	System.out.println("$0");
    }else if (speed > 60 && speed <= 75){
    	System.out.println("$100");
    }else if (speed > 75 && speed <= 90 ){
    	System.out.println("$200");
    }else if (speed > 90 ){
        System.out.println("$500");
    }

    	  




    }
 }