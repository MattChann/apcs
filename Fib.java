import java.lang.Math.*;

/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
        if(n==1 || n==2) return 1;
        return fib_recurrence(n-1) + fib_recurrence(n-2);
    }
     /* These are class methods because the nth Fibonacci number does not change.
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
        if(n==1) return 1;
        long currentFib = 1;
        long prevFib = 1;
        int currentN = 2;

        while(n != currentN) {
            long tempFib = currentFib;
            currentFib += prevFib;
            prevFib = tempFib;
            currentN++;
        } return currentFib;
    }
    /* Time complexity:
       Consider the size of the problem to be n
       
       As the proxy for the time required, count number of iterations.
       
       Then cost of the the recurrence algorithm
       grows linearly
       as the size of the problem increases,
       because the each iteration increments currentN by 1 so you would need to iterate n times to get F_n.
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
        double phi = (0.5)*(1 + Math.sqrt(5));
        double psi = (0.5)*(1 - Math.sqrt(5));

        return (1/(phi-psi))*(Math.pow(phi,n) - Math.pow(psi,n));
    }
    /* Time complexity:
       Consider the size of the problem to be n
       
       As the proxy for the time required, count calculations?
       
       Then cost of the the recurrence algorithm
       stays constant
       as the size of the problem increases,
       because the same number of calculations are being made no matter the value of n.
     */
}
