/**
 Test list features.
 */
public class UserOfList {
    private static List_inArraySlots list = new List_inArraySlots();
    
    public static void main( String[] args ) {
        list.add(3.14);
        list.add("piazza");
        list.add(6.28);
        list.add("pi");
        list.add(256);
        list.add(Double.POSITIVE_INFINITY);
        list.add("tau");
        list.add("pizza");
        list.add(1e4);
        list.add(Double.NEGATIVE_INFINITY);

        System.out.println(Accumulator.catElementsStartingWith(list, "pi"));
    }
}
