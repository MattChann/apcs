public class OrderedList_inArraySlots {
    List_inArraySlots list;

    public OrderedList_inArraySlots() {
        list = new List_inArraySlots();
    }

    public boolean add(Object value) {
        list.add(value);
        return true;
    }

    public String toString() {
        return sort(list);
    }

    private List_inArraySlots sort(List_inArraySlots list) {
        return list;
    }
}