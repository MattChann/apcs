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
     */
    public void mySort() {
        for(int i=0; i<elements.size(); i++) {
            swap(elements, i, reigningDweeb(elements,i));
        }
    }

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
