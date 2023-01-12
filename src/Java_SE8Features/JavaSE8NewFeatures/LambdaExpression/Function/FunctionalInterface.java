package Java_SE8Features.JavaSE8NewFeatures.LambdaExpression.Function;

import java.util.function.Function;

public class FunctionalInterface {
    public static void main(String[] args) {
       Function<String ,Integer> functional=(s)->s.length();
        System.out.println(functional.apply("Specialist programmer"));
    }
}

