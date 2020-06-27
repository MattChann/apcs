/**
  Represent accumulating data from the elements in a
  List_inArraySlots that are of a particular type.
 */
 public class Accumulator {
    /**
      @return the concatenation of all the Strings
      in the \list that begin with \prefix,
      each followed by a space.
     */
    public static String catElementsStartingWith(List_inArraySlots list, String prefix){
        String result = "";
        for(int i=0; i<list.size(); i++){
            Object currentElement = list.get(i);

        //-----------------------------------------------------------------------
            /* 3.  Stumbling block 0
               Java protects a programmer against applying a method to
               elements in list when some elements of the list might
               omit support for a particular operation.

               This protection is implemented by the _COMPILER_
               The following code violates the restriction:
              */

            // currentElement.startsWith(prefix);

            /*
             predicted error message: startsWith() not found in Object.java

             actual error message: "cannot find symbol: method startsWith(String)"
             */
        //-----------------------------------------------------------------------
            /* 4.  Workaround 0
               A programmer should expect there to be a way to
               work around the stumbling block, because
               the _JVM_
               knows the type of an element.

               Java's _instanceOf_ operator identifies the type
               of an element to the _JVM_.
             */
        //-----------------------------------------------------------------------
            /* 5.  Stumbling block 1
               However, use of the operator alone is insufficient,
               because the _COMPILER_
               objects to the following code that adds use of
               the operator to the code from Stumbling block 0:
             */

            // if (currentElement instanceof String){
            //     currentElement.startsWith(prefix);
            // }

            /*
             predicted error message: cannot find symbol

             actual error message: "cannot find symbol: method startsWith(String)"
             */
        //-----------------------------------------------------------------------
            /* 6. Workaround 1
               Programmers use Java's _cast_ operator
               to tell the _COMPILER_ (compiler? JVM?)
               that code uses a subclass's method on an object,
               even though the reference to the object is stored
               in a super-class variable.
             */
        //-----------------------------------------------------------------------
            /* 7. Stumbling block 2
               However, use of this operator alone is insufficient,
               because the __ (compiler? JVM?)
               objects to the following code that adds use of
               the operator to the code from Stumbling block 0:
             */

            // String currentString = (String)currentElement;
            // if (currentString.startsWith(prefix)){
            //     result += currentString;
            // }

            /*
             predicted error message: <type> cannot be cast to string

             actual error message: "java.lang.ClassCastException: java.lang.Double cannot be cast to java.lang.String"
             */
        //-----------------------------------------------------------------------
            /* 8. Workaround 2
               A programmer can combine use of both operators
               to apply a method to exactly those
               elements in the list that support the method.
             */
        //-----------------------------------------------------------------------


        // Working Code
            if (currentElement instanceof String){
                String currentString = (String)currentElement;
                if (currentString.startsWith(prefix)){
                    result += currentString;
                }
            }
        }
        return result;
    }

    /**
      @return a list of each of the Double elements
      from the \list whose value is "finite".
     */
    public static List_inArraySlots finites(List_inArraySlots list) {
        List_inArraySlots resultList = new List_inArraySlots();
        for(int i=0; i<list.size(); i++){
            Object currentElement = list.get(i);
            if (currentElement instanceof Double){
                Double currentDouble = (Double)currentElement;
                if (Double.isFinite(currentDouble)){
                    resultList.add(currentDouble);
                }
            }
        }
        return resultList;
    }
}