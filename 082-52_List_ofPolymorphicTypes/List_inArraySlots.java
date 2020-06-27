/**
  Implement a list of diverse types, including
  integers, double-precision floating point numbers,
  and Strings.
 */
public class List_inArraySlots {
    private Object[] list;
    private int filledElements; // the number of elements in this list

    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        list = new Object[INITIAL_CAPACITY];
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
            stringRep += list[i] + ",";
        }
        return stringRep + "]";
    }


    /**
      Appends @value to the end of this list.

      @return true, in keeping with conventions yet to be discussed
     */
    public boolean add(Object addedValue) {
        if (filledElements == list.length){
            expand();
        }
        list[filledElements] = addedValue;

        filledElements++;
        return true;
    }


    /**
      Double the capacity of the List_inArraySlots,
      preserving existing data.
     */
    private void expand() {
        Object[] oldList = list;
        list = new Object[list.length * 2];

        for(int i=0; i<oldList.length; i++) {
            list[i] = oldList[i];
        }
    }

    public Object get(int index) {
        return list[index];
    }
}