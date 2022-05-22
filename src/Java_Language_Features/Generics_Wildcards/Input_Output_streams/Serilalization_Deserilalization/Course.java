package Java_Language_Features.Generics_Wildcards.Input_Output_streams.Serilalization_Deserilalization;

import java.io.Serializable;

public class Course implements Serializable {

    private String cname;

    public Course(String cname) {
        this.cname = cname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
