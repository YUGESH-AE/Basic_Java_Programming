package Java_Se8.Java_Language_Features.Inner_Anonymous_Class.Anonymous_Class;

public class TestAnonymous {
    public static void main(String[] args) {
        Testing a=new Testing() {
            @Override
            public void run() {
                System.out.println("Running inside anonymous inner class");
            }
        };
        a.run();
    }

}

interface Testing{
    void run();
}