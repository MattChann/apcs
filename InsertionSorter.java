/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }
    

    /**
      sort the user's data, implementing insertion sort

      Runs insertOne for positions 1 through n-1 in the list
     */
    public void mySort() {
        for(int indexToSort=1; indexToSort<elements.size()-1; indexToSort++) {
            insertOne(elements, indexToSort);
        }
    }

    /**
      Given: list and the amount of elements already sorted
    
      Shifts all elements greater than the first unsorted element
      Inputs the first unsorted element into the space created
    */
    private static void insertOne(ArrayList<String> elements, int numSorted) {
        String valueToInsert = elements.get(numSorted);
        for(int indexToCompare=numSorted-1; indexToCompare>=-1; indexToCompare--) {
            if(indexToCompare == -1 || valueToInsert.compareTo(elements.get(indexToCompare)) >= 0) {
                // dropValue()
                elements.set(indexToCompare+1, valueToInsert);
                break;
            }
            // shift()
            elements.set(indexToCompare+1, elements.get(indexToCompare));
        }
    }
}
