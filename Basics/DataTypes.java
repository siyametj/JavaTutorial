// DataType.java 

/*
 Two type of data in Java language!
    1. Primitive data type (built-in)
    2. Non primitive data type (reference)

*/
public class DataTypes {
    public static void main(String[] args) {
        // -------- 1. Primitive 
        
        // type : byte | size = 1 byte
        // Small integer 
        byte xByte = 100;
        System.out.println("Byte is : " + xByte);
        
        // type : short | size = 2 bytes 
        // Mid integer 
        short anyShort = 30000;
        System.out.println("A short : " + anyShort);
        
        // type : int | size = 4 bytes 
        // Most used integer 
        int age = 17;
        System.out.println("My age is " + age);
        
        // type : long | 8 bytes 
        // Long integer 
        // Must need use L 
        long population = 9999999999L;
        System.out.println("Population: " + population);
        
        // type : float | size = 4 bytes 
        // Decimal 
        // Must use f
        float pizzaPrice = 5.00f;
        System.out.println("Pizza price $" + pizzaPrice);
        
        // type : double | size = 8 bytes
        // Most used for decimal
        double economy = 97784.8767;
        System.out.println("Economy rate " + economy);
        
        // type : char | size = 2 bytes
        // Only a character 
        // must use single quote 
        char grade = 'A';
        System.out.println("My grade " + grade);
        
        // type : boolean | size = JVM-dependent
        // value : true / false 
        boolean isStudent = true;
        System.out.println("Siyam is a student? " + isStudent);
        
        // -------- 2. Non Primitive
        // String, Array, Class, Interface, Enum, Record
        String name = "Siyam";
        System.out.println("Name: " + name);
        
        
        /*
         * Note : Most used data type :
         *      - int, double, boolean, char, String
         * From float and double! double use most of the time 
         * For float in last add f
         * For long in last add L
         */
    }
}