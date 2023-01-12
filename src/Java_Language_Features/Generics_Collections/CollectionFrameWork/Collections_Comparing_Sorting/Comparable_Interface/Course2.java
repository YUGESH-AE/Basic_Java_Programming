package Java_Language_Features.Generics_Collections.CollectionFrameWork.Collections_Comparing_Sorting.Comparable_Interface;

public class Course2 implements Comparable<Course2> {
    private int courseId;
    private String courseName;

    public Course2(int courseId, String courseName) {
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
    public int compareTo(Course2 other) {
        return courseName.compareTo(other.courseName);
    }
}
