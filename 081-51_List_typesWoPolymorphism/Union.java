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
        String stringRep = "";
        if (type == List_inArraySlots.Types.INT) {
            stringRep += intVal;
        }
        if (type == List_inArraySlots.Types.DOUBLE) {
            stringRep += doubleVal;
        }
        if (type == List_inArraySlots.Types.STRING) {
            stringRep += stringVal;
        }
        return stringRep;
    }
}