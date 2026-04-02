public class DefaultValues{
    // Member variables for each primitive types
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;
    
    public static void main(String[] args){
        // Instance of the DefaultValues
        DefaultValues myObj = new DefaultValues();
        
        
        /*
        This works for member variables because Java assigns them default values automatically whereas
        this would not work for local variables as they must be explicityly initialized before the use,
        otherwise it gives a compile error telling the variable must be initialized.
        */
        
        // Print default values
        System.out.println("Default values: ");
        System.out.println("Byte: " + myObj.byteVar);
        System.out.println("Short: " + myObj.shortVar);
        System.out.println("Int: " + myObj.intVar);
        System.out.println("Long: " + myObj.longVar);
        System.out.println("Float: " + myObj.floatVar);
        System.out.println("Double: " + myObj.doubleVar);
        System.out.println("Char: " + myObj.charVar);
        System.out.println("Boolean: " + myObj.booleanVar);
        
        
        
    }

}