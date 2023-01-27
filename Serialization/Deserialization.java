package Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Deserialization {
    public static void main(String[] args) {
        Serialize obj=null;
        try(
            FileInputStream file=new FileInputStream("ser.txt");
            ObjectInputStream inStream=new ObjectInputStream(file)
        ){
            obj=(Serialize)inStream.readObject();
            System.out.println("done...");
        }
        catch(Exception exception){
            System.out.println(exception.getLocalizedMessage());
        }
        System.out.println(obj.toString());
    }
}
