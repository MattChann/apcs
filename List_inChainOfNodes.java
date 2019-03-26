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
            stringRep += currentNode.getCargoReference() + ",";
            currentNode = currentNode.getReferenceToNextNode();
        }
        return stringRep + "]";
    }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
    public boolean addAsHead(Object val) {
        headReference = new Node(val, headReference);
        return true;
    }


    //-------Helper Method-------
    private Node getNode(int index) {
        Node currentNode = headReference;
        for (int i=0; i<index; i++) {
            currentNode = currentNode.getReferenceToNextNode();
            if (currentNode == null) {
                break;
            }
        }
        return currentNode;
    }

    public void testGetNode() {
        for (int i=0; i<size(); i++) {
            System.out.println(getNode(i));
        }
    }
    //---------------------------

    public Object set(int index, Object newValue) {
        Node nodeBeingSet = getNode(index);
        Object oldVal = nodeBeingSet.getCargoReference();
        nodeBeingSet.setCargoReference(newValue);
        return oldVal;
    }


    public Object get(int index) {
        return getNode(index).getCargoReference();
    }


    public boolean add(int index, Object val) {
        if (index == 0) {
            addAsHead(val);
        } else {
            Node newNode = new Node(val,getNode(index));
            getNode(index-1).setReferenceToNextNode(newNode);
        }

        return true;
    }


    public Object remove(int index) {
        Object oldVal = getNode(index).getCargoReference();
        if (index == 0) {
            headReference = getNode(index + 1);
        } else {
            getNode(index-1).setReferenceToNextNode(getNode(index + 1));
        }

        return oldVal;
    }
}