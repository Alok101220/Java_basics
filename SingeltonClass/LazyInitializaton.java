/*
 * object is created when required
 * no resource and CPU wastage
 * excepction handling is possible
 * instance cannot be directly accessed 
 * in multithreaded environment it may break singleton property 
 */
public class LazyInitializaton {
    private static LazyInitializaton instance= null;
    private LazyInitializaton(){

    }

    public static LazyInitializaton getInstance(){
        if(instance==null){
            instance= new LazyInitializaton();
        }
        return instance;
    }
    public static void main(String[] args) {
        
    }
}

/*
 * Thread Safe Singleton
 * lazy initializaton is possible
 * it is also thread safe
 * getInstance() method is synchronized so it causes slow performance bcz others thread have to wait
 */
//  class LazyInitializaton{
//     private static LazyInitializaton instance=null;
//     private LazyInitializaton();

//     synchronized public static LazyInitializaton getInsstance(){
//         if(instance==null){
//             instance= new LazyInitializaton();
//         }
//         return instance;
//     }
//  }


/*
 * Lazy initialization with double check locking
 * in this getInstance() function is not synchronized but in this block which created instance is synchronized
 */

//  class LazyInitializaton{
//     private static LazyInitializaton instance=null;
//     private LazyInitializaton();
//     public static LazyInitializaton getInstance(){
//         if(instance==null){
//             synchronized(LazyInitializaton.class){
//                 if(instance==null){
//                     instance=new LazyInitializaton();
//                 }
//             }
//         }
//         return instance;
//     }
//  }

/*
 * Bill Pugh Singleton Implementation
 * a concept of inner static classes to use for singleton.
 * when the singleton class is loaded, inner class is not loaded and heance
 * doesn't create object when loading the class, inner class is created only when getInstance method is called.
 * this is most widely used doesn't uses synchronization
 */

 class LazyInitializaton{
    private LazyInitializaton();
    private static class BillPughSingleton{
        private static final LazyInitializaton INSTANCE= new LazyInitializaton();
    }
    public static LazyInitializaton getInsstance(){
        return BillPughSingleton.INSTANCE;
    }
 }