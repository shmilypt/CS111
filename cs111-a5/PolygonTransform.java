/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Peiqi Tang 
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {

	// WRITE YOUR CODE HERE
        double a[] = new double[array.length];
        for (int i=0; i<array.length; i++){
            a[i] = array[i];
            }
        return a;

    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

	// WRITE YOUR CODE HERE
        double a = alpha;
    
        for (int i=0; i< x.length;i++){
            x[i] = x[i]*alpha;
            y[i] = y[i]*alpha;
            }

    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

	// WRITE YOUR CODE HERE
        for (int i=0; i< x.length;i++){
            x[i] = x[i]+dx;
            y[i] = y[i]+dy;
            }
    
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

	// WRITE YOUR CODE HERE
        theta = theta*(Math.PI)/180;
        for(int i=0;i<x.length;i++){
        double a = x[i];
        double b = y[i];
        x[i] = a*(Math.cos(theta))-b*(Math.sin(theta));
        y[i] = b*(Math.cos(theta))+a*(Math.sin(theta));
        
        }
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

	// WRITE YOUR CODE HERE
    StdDraw.setScale(-5.0, +5.0); 
    double[] x = { 0, 1, 1, 0 }; 
    double[] y = { 0, 0, 2, 1 };
    StdDraw.setPenColor(StdDraw.RED); 
    StdDraw.polygon(x, y); 
    StdDraw.setPenColor(StdDraw.BLUE);
    double alpha = 2.0;
    double [] a = copy(x); 
    double [] b = copy(y);
    scale(a,b,alpha);
    StdDraw.polygon(a,b);
    double dx = 2.0, dy = 1.0; 
    double [] c = copy(x); 
    double [] d = copy(y);
    translate(c,d,dx,dy);
    StdDraw.polygon(c,d); 
    double theta = 45.0;
    double [] e = copy(x); 
    double [] f = copy(y);
    rotate(e,f,theta);
    StdDraw.polygon(e,f);  



 

    }
}
