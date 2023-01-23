package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializatio {
    public static void main(String[] args) {
        Serialize object= new Serialize(2, "Alok", "DSA");

        try(
            FileOutputStream file= new FileOutputStream("ser.txt");
            ObjectOutputStream outStream= new ObjectOutputStream(file)){
            outStream.writeObject(object);
            System.out.println("Done....");
        }
        catch(IOException ioe){
            ioe.printStackTrace();
            System.out.println(ioe.getLocalizedMessage());
        }
    }
}
