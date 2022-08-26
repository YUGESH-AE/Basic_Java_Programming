package Java_Se8.Java_Language_Features.Generics_Collections.CollectionFrameWork.Collections_Comparing_Sorting.Comparator_Interface;

import java.util.Comparator;

public class Course1 implements Comparator<Course1> {
    private int courseId;
    private String courseName;

    public Course1(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course1{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                '}';
    }

    @Override
    public int compare(Course1 o1, Course1 o2) {
        return o1.courseId-o2.courseId;
    }


}
