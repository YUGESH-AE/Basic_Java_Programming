package Java_SE8Features.JavaSE8NewFeatures.LambdaExpression.Function;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        Supplier<LocalDateTime> supplier=()->{
            return LocalDateTime.now();
        };
        System.out.println(supplier.get());
    }
}
