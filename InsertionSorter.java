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
     */
    public void mySort() {
        for(int indexToSort=0; indexToSort<elements.size(); indexToSort++) {
            insertOne(elements, indexToSort);
        }
    }

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
