/*************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix 2
 *
 *  @author:Peiqi Tang
 *
 * The program HadamardMatrix prints H(n)
 *
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *************************************************************************/

public class HadamardMatrix {

    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    	int n = Integer.parseInt(args[0]);
    	boolean [] [] matrix = new boolean [n] [n];
    	matrix [0] [0] = true;
    	for (int i=1 ; i<n ; i+=i){
    		for(int j=0; j<i ; j++){
    			for(int k=0; k<i; k++){
    				matrix [i+j] [k] = matrix [j] [k];
    				matrix [j] [i+k] = matrix [j] [k];
    				matrix [i+j] [i+k] =! matrix [j] [k];
    			}

    		}
    	}

    	for(int i=0 ; i<n ; i++){
    		for (int j=0 ; j<n ; j++){
    			if(matrix [i] [j] == true){
    				System.out.print("T ");
    			}else{
    				System.out.print("F ");
    			}
    		}
    		System.out.println();
    	}


 

    }
}
