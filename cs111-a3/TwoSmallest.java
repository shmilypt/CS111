/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author:Peiqi Tang
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 *************************************************************************/

public class TwoSmallest {

   public static void main(String[] args) {
   
   // WRITE YOUR CODE HERE
      double [] array = new double [args.length];
      double smallest = Double.MAX_VALUE;
      int smallestIndex = 0;

    	
      for (int i=0; i<args.length;i++){
        Double number = Double.parseDouble(args[i]);
        array[i] = number;
        if(smallest>array[i]){
        	smallest = array [i];
        	smallestIndex = i;
      	}
      }
      double temp = array[smallestIndex];
      array[smallestIndex] = array[0];
      array[0] = temp; 
      double twoSmallest = Double.MAX_VALUE;
      for(int i=1; i<args.length;i++){
         if(twoSmallest>array[i]){
            twoSmallest = array[i];
         }
      
      }
      System.out.println(smallest);
      System.out.println(twoSmallest);

   }

}
