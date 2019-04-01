public class UserOfOrderedList {
    public static void main(String[] args) {
        OrderedList_inArraySlots list = new OrderedList_inArraySlots();

        System.out.println("Size (empty): " + list.size());
        System.out.println("toString: " + list);

        for(int i=0; i<8; i++) {
            list.add(i);
        }
        System.out.println(System.lineSeparator() + "Testing Adding to List:");
        System.out.println("Size: " + list.size());
        System.out.println("toString: " + list);

        list.add(-1);
        list.add(3.5);
        list.add(10);
        System.out.println(System.lineSeparator() + "Testing Ordering of List:");
        System.out.println("Size: " + list.size());
        System.out.println("toString: " + list);
    }
}