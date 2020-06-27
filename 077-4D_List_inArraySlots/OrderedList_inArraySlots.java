public class OrderedList_inArraySlots {
    List_inArraySlots list;

    public OrderedList_inArraySlots() {
        list = new List_inArraySlots();
    }

    public boolean add(int value) {
        if (list.size() == 0) {
            list.add(value);
            return true;
        }
        for(int i=0; i<list.size(); i++) {
            if (list.get(i) >= value) {
                list.add(i, value);
                return true;
            }
        }
        list.add(value);
        return true;
    }

    public String toString() {
        return list.toString();
    }

    public int get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }
}