package Java_Se8.javaSE8Features.JavaSE8NewFeatures.LambdaExpression;

public class RunnableLambda {
    public static void main(String[] args) {
        Runnable run=()-> System.out.println("Running inside the thread");
        run.run();
    }
}
