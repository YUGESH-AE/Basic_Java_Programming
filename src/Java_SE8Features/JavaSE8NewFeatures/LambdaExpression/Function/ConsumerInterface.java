package Java_SE8Features.JavaSE8NewFeatures.LambdaExpression.Function;

import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {

        Consumer<String>consumer=(s)-> System.out.println(s);
        consumer.accept("Specialist programmer");
    }
}

