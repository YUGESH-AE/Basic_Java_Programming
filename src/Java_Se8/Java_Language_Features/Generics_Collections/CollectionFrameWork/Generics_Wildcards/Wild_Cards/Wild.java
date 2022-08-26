package Java_Se8.Java_Language_Features.Generics_Collections.CollectionFrameWork.Generics_Wildcards.Wild_Cards;

import java.util.ArrayList;
import java.util.List;

public class Wild {
    public static void main(String[] args) {
        Record<Student> studentrecord = new Record<>();
        Student student = new Student(101,"Adam");

        Record<Dayscholar> dayscholaarecord = new Record<>();
        Dayscholar dayscholar = new Dayscholar(102,"Robert",10000f);

        studentrecord.add(student);
        studentrecord.display(studentrecord);

        dayscholaarecord.add(dayscholar);
        dayscholaarecord.display(dayscholaarecord);

    }

}


class Record<E>{

    List<E>record=new ArrayList<>();

    @Override
    public String toString() {
        return "Record{" +
                "record=" + record +
                '}';
    }
    public void add(E e){
        record.add(e);
    }
    public void display(Record<?super Dayscholar> record1){
        System.out.println("Student record:"+record);
    }
}



class Student{
   private int id;
   private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Dayscholar extends Student{

   private float stipend;

    public Dayscholar(int id, String name,float stipend) {
        super(id, name);
        this.stipend=stipend;
    }

    public float getStipend() {
        return stipend;
    }

    @Override
    public String toString() {
        return "Dayscholar{" +
                "id=" + getId() +
                ", name='" + getName()+","+
        "stipend=" + stipend +
                '}';
    }
}