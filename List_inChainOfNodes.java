/**
  Represent a list, implemented in a chain of nodes
 */
public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
    public List_inChainOfNodes() {
    }
     

    /**
      @return the number of elements in this list
     */
    public int size() {
        Node currentNode = headReference;
        int size = 0;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.getReferenceToNextNode();
        }
        return size;
    }

    
    /**
      @return a string representation of this list,
      format:
          # elements [element0,element1,element2,] 
     */
    public String toString() {
        String stringRep = size() + " elements [";
        Node currentNode = headReference;
        while (currentNode != null) {
            stringRep += currentNode + ",";
            currentNode = currentNode.getReferenceToNextNode();
        }
        return stringRep + "]";
    }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead(Object val) {
        Node newHead = new Node(val, headReference);
        headReference = newHead;
        return true;
     }
}