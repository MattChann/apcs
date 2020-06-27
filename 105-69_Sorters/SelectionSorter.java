/**
  Implement an selection sort, in the Sorters structure
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }
    

    /**
      sort the user's data, implementing selection sort

      Runs reigningDweeb for positions 0 through n-1 in the list
      Swaps the lowest element into its correct index each time
     */
    public void mySort() {
        for(int i=0; i<elements.size()-1; i++) {
            swap(elements, i, reigningDweeb(elements,i));
        }
    }

    /**
      Given: list and the amount of elements already sorted
    
      Finds the lowest element in the list not including the elements already sorted
      Returns the index of that element
    */
    private static int reigningDweeb(ArrayList<String> elements, int numSorted) {
        String lowestElement = elements.get(numSorted);
        int lowestElementIndex = numSorted;
        for(int i=numSorted; i<elements.size(); i++) {
            String currentElement = elements.get(i);
            if(currentElement.compareTo(lowestElement) < 0) {
                lowestElement = currentElement;
                lowestElementIndex = i;
            }
        }
        return lowestElementIndex;
    }

    private static void swap(ArrayList<String> elements, int index1, int index2) {
        elements.set(index2, elements.set(index1, elements.get(index2)));
    }
}
