/*
 * Eager Instance
 * 1. resource wastage, because instance of the class is created every time 
 * 2. Cpu time is also wastage
 * 3. Excepction handling is not possible 
 */

// public class EagerInstantiation {
//     private static EagerInstantiation eager_instance=new EagerInstantiation();
    
//     public static EagerInstantiation getInstance(){
//         return eager_instance;
//     }
//     public static void main(String[] args) {
//         System.out.println(EagerInstantiation.getInstance().ha);
//     }
// }


/*
 * Implementation of getInstace is not required
 * Excepction can be handled in static block
 * Resource and CPU wastage is still there
 */

public class EagerInstantiation{
    private static EagerInstantiation instance;
    private EagerInstantiation(){}

    static{
        instance= new EagerInstantiation();
    }

    public static void main(String[] args) {
        System.out.println(instance);
    }
}