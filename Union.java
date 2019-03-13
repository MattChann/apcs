public class Union {
    List_inArraySlots.Types type;
    int intVal;
    double doubleVal;
    String stringVal;

    public Union(List_inArraySlots.Types type, int intVal, double doubleVal, String stringVal){
        this.type = type;
        this.intVal = intVal;
        this.doubleVal = doubleVal;
        this.stringVal = stringVal;
    }

    public String toString(){
        if (type == Types.INT) {
            return intVal + "";
        }
        if (type == Types.DOUBLE) {
            return doubleVal + "";
        }
        if (type == Types.STRING) {
            return stringVal + "";
        }
    }
}