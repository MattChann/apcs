import java.lang.Math;

/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable{
    private double xcor;
    private double ycor;
    
    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer, 
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo(Object otherObj){
        Point otherPoint = (Point)otherObj;
        return (int)(Math.hypot(xcor,ycor) - Math.hypot(otherPoint.xcor,otherPoint.ycor));
    }

    // -------- previously-written code ----------
    // constructor
    public Point(double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")"; 
    }

}