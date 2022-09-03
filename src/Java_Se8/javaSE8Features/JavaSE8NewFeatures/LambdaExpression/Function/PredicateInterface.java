package Java_Se8.javaSE8Features.JavaSE8NewFeatures.LambdaExpression.Function;

import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {

        Predicate<Integer>predicate=(num)->num%2==0;
        System.out.println(predicate.test(22));
    }
}

