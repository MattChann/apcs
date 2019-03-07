/**
  Implement a list of integer elements, including
  both data and operations.
 */
public class List_inArraySlots {
    private int[] list;
    private int capacity;
    private int lastIndex = -1;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        list = new int[8];
        capacity = list.length;
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
        return lastIndex + 1;
    }


     /** 
       @return a string representation of this list,
       in [a,b,c,] format
      */ 
    public String toString() {
        String stringForm = "[";
        for (int i=0;i<this.size();i++) {
            stringForm += list[i] + ",";
        }
        return stringForm + "]";
    }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
    public boolean add(int value) {
        if(capacity == this.size()) {
            this.expand();
        }
        list[this.size()] = value;

        lastIndex++;

        return true;
    }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
    private void expand() {
        int[] oldList = list;
        list = new int[capacity*2];
        capacity = list.length;

        for (int i=0;i<oldList.length;i++) {
            list[i] = oldList[i];
        }
    }
}