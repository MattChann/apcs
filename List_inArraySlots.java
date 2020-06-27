/**
  Implement a list of integer elements, including
  both data and operations.
 */
public class List_inArraySlots {
    private int[] list;
    private int lastIndex = -1;
    private static final int INITIAL_CAPACITY = 10;

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        list = new int[INITIAL_CAPACITY];
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
        if(list.length == this.size()) {
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
        list = new int[list.length * 2];

        for (int i=0;i<oldList.length;i++) {
                list[i] = oldList[i];
        }
    }

    /** 
      accessor  
      @return element @index from this list
      precondition: @index is within the bounds of the array.
            (Having warned the user about this precondition,
            you should NOT complicate your code to check
            whether user violated the condition.)
     */
    public int get(int index) {
        return list[index];
    }


    /** 
      Store et value at @index to @newValue
            
      @return old value at @index
      @precondition: @index is within the bounds of this list.
     */
    public int set(int index, int newValue) {
        int oldItem = list[index];
        list[index] = newValue;
        return oldItem;
    }

        
    /** 
      Remove the element at position @index in this list.
      Shift any subsequent elements to the left (that is, 
      decrease the index associated with each).
        
      @return the value that was removed from the list
     */
    public int remove(int index) {
        int removedItem = list[index];
        for (int i=index;i<this.size()-1;i++) {
            list[index] = list[index + 1];
        }
        list[this.size()-1] = 0;

        lastIndex--;
        return removedItem;
    }


    /** 
      Insert @value at position @index in this list.

      Shift the element currently at that position (if any)
      and any subsequent elements to the right
      (that is, increase the index associated with each).
     */
    public void add(int index, int value) {
        if(list.length == this.size()) {
            this.expand();
        }
        for(int i=this.size();i>index;i--) {
            list[i] = list[i-1];
        }
        list[index] = value;

        lastIndex++;
    }
}