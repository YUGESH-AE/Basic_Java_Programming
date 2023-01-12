package Java_Language_Features.MultiThreading.Inter_thread_communicarion;

public class Course {
    String courseName;
    int numOfSeats;
    public Course(String courseName, int numOfSeats) {
        this.courseName = courseName;
        this.numOfSeats = numOfSeats;
    }
    public synchronized void  registerForCourse(int rollNo) {
        try {
            if(this.numOfSeats-1<0)
                this.wait(5000);
            if(this.numOfSeats - 1 < 0) {
                throw new Exception("No more seats available for this course");
            }
            System.out.println("Booking successful!");
            this.numOfSeats -= 1;
            System.out.println("Available seats: " + this.numOfSeats);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public synchronized void cancelSeats() {
        try {
            this.numOfSeats += 1;
            System.out.println("Cancellation successful!");
            System.out.println("Available seats: " + this.numOfSeats);
            this.notify();    // Notifies one of the waiting threads to resume
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

