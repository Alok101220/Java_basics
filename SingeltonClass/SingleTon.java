/* 
Make sure that only one instance of the class should exist.

provide global access to that instance by:-
    declare all constructor to be private
    method to be static ( lazy initialization concept is used).
    instance is sotred as a static variable

    examples, Runtime class / Action Servlet / Service Locator

getInstance() , this method is used to instantiate the object of the class

*/

class SingleTon{

    private static SingleTon single_instance=null;

    public String s;
    
    // constructor
    private SingleTon(){
        s="I am constructor";
    }
    public static SingleTon getInstance(){
        if(single_instance==null){
            single_instance= new SingleTon();
        }
        return single_instance;
    }
    public static void main(String[] args) {
       SingleTon x= SingleTon.getInstance();
       System.out.println(x.hashCode());
       SingleTon y= new SingleTon();
       System.out.println(y.hashCode());
       SingleTon z= SingleTon.getInstance();
       System.out.println(z);
       SingleTon xx= new SingleTon();
       System.out.println(xx);
       System.out.println(xx.s);
       
    }
}