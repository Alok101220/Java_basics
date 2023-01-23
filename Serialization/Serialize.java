package Serialization;
import java.io.*;
public class Serialize implements Serializable{
    private static final long serialVersionUID= 1221L;
    private int id;
    private String name;
    private  String course;

    public Serialize(int id, String name, String course){
        this.id=id;
        this.name=name;
        this.course=course;
    }
    public String toString(){
        return this.id+" : "+ this.name+ " : "+ this.course;
    }
}
