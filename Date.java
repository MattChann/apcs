/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    
    public int compareTo(Object otherObj) {
        Date otherDate = (Date)otherObj;
        return 365*(y-otherDate.y) + 31*(m-otherDate.m) + (d-otherDate.d);
    }

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

}