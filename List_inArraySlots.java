/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */
public class List_inArraySlots {
    private int[]    intElements;
    private double[] doubleElements;
    private String[] stringElements;
    private int filledElements; // the number of elements in this list
    
    /* type identifier for each element
       That is, typeOfElements[i] == 0 means element i is an integer;
                                     1 means element i is a double;
                                     2 means element i is a String.
        Optional extra education in programming (not comp sci):
            replace these "magic numbers" with an "enumerated type".
     */

    public enum Types {INT, DOUBLE, STRING};
    private Types[] typeOfElements;

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        intElements = new int[INITIAL_CAPACITY];
        doubleElements = new double[INITIAL_CAPACITY];
        stringElements = new String[INITIAL_CAPACITY];

        typeOfElements = new Types[INITIAL_CAPACITY];
    }


    /**
      @return the number of elements in this list
     */
    public int size() {
        return filledElements;
    }


    /**
      @return a string representation of this list,
      in [a,b,c,] format
     */
    public String toString() {
        String stringRep = "[";
        for(int i=0; i<filledElements; i++) {
            if (typeOfElements[i] == Types.INT) {
                stringRep += intElements[i];
            }
            else if (typeOfElements[i] == Types.DOUBLE) {
                stringRep += doubleElements[i];
            }
            else if (typeOfElements[i] == Types.STRING) {
                stringRep += stringElements[i];
            }
            stringRep += ",";
        }
        return stringRep + "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
    public boolean add( Types  type   // same meaning as in typeOfElements
                      , int    intValue
                      , double doubleValue
                      , String stringValue
                      ) {
        if (filledElements == typeOfElements.length){
            expand();
        }

        typeOfElements[filledElements] = type;
        if (type == Types.INT) {
            intElements[filledElements] = intValue;
        }
        else if (type == Types.DOUBLE) {
            doubleElements[filledElements] = doubleValue;
        }
        else if (type == Types.STRING) {
            stringElements[filledElements] = stringValue;
        }

        filledElements++;
        return true;
    }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
    private void expand() {
        int[] oldIntElements = intElements;
        double[] oldDoubleElements = doubleElements;
        String[] oldStringElements = stringElements;
        Types[] oldTypeOfElements = typeOfElements;

        int oldLength = typeOfElements.length;
        intElements = new int[oldLength*2];
        doubleElements = new double[oldLength*2];
        stringElements = new String[oldLength*2];
        typeOfElements = new Types[oldLength*2];

        for(int i=0; i<oldLength; i++) {
            intElements[i] = oldIntElements[i];
            doubleElements[i] = oldDoubleElements[i];
            stringElements[i] = oldStringElements[i];
            typeOfElements[i] = oldTypeOfElements[i];
        }
    }

    // Unfinished
    /*
    public Types get(int index) {
        if (typeOfElements[index] == Types.INT) {
            return intElements[index];
        }
        if (typeOfElements[index] == Types.DOUBLE) {
            return doubleElements[index];
        }
        if (typeOfElements[index] == Types.STRING) {
            return stringElements[index];
        }
    }
    */
}