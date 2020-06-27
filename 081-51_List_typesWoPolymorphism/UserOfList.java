/**
 Test list features.
 */
public class UserOfList {
    private static List_inArraySlots list;
    
    public static void main( String[] args ) {
        list = new List_inArraySlots();

        System.out.println( "number of elements: " + list.size() );
        System.out.println( "empty list: " + list);

        // Populate the list with diverse elements.
        list.add(List_inArraySlots.Types.STRING, -1, -2.0,  "important");
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added string: " + list);

        list.add(List_inArraySlots.Types.INT, 17, -2.0,  "junk");
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added int: " + list);

        list.add(List_inArraySlots.Types.DOUBLE, -1, 1.618, "junk");
        System.out.println( "number of elements: " + list.size() );
        System.out.println( "added double: " + list);

        // Add enough elements that expansion is expected
        for( int elemIndex = list.size(); elemIndex < 15; elemIndex++ ) {

            if( list.size() == 10) System.out.println( "expansion expected");

            list.add(List_inArraySlots.Types.INT, -elemIndex, -2.0,  "junk");
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println("result of expanded list: "
             + list.size() + " elements:");
        System.out.println( list + System.lineSeparator());

        getTest(list);
    }

    public static void getTest(List_inArraySlots list){
        for(int i=list.size()-1; i>=0; i--) {
            System.out.println(i + ": " + list.get(i));
        }
    }
}
