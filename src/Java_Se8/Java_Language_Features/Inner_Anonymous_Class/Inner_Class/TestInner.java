package Java_Se8.Java_Language_Features.Inner_Anonymous_Class.Inner_Class;

public class TestInner {
    public static void main(String[] args) {
        Manager s=new Manager();
        String empid="100";
        char grade=s.checkempID(empid,90);
        System.out.println("Grade of the employee is-->"+grade);

    }
}

class Manager{
    private class Grade{
        private char grade;
        private char calculateGrade(String empid,int point){
            if (isEmployeeExist(empid)){
                if (point  < 100 && point >= 90) {
                    grade = 'A';
                } else if (point < 90 && point >= 80) {
                    grade = 'B';
                } else {
                    grade = 'C';
                }
            }
            return grade;
        }
        private boolean isEmployeeExist(String empid){
            if(empid=="100"){
                return true;
            }
            return false;
        }
    }
    public char checkempID(String empid,int point){
        Grade a=new Grade();
        return a.calculateGrade(empid, point);
    }
}