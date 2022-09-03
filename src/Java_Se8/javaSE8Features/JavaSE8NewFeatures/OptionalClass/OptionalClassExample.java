package Java_Se8.javaSE8Features.JavaSE8NewFeatures.OptionalClass;

import java.util.Objects;
import java.util.Optional;

public class OptionalClassExample {
    public static void main(String[] args) {

//        Optional<Objects> obj=Optional.empty();
//        System.out.println(obj);
        String b = null;

        Optional<String> ob = Optional.ofNullable(b);
        if (ob.isPresent()) {
            System.out.println(ob.get());
        } else{
        String ex=ob.orElseThrow(()->new IllegalArgumentException());
            System.out.println(ex.getClass());
        System.out.println(ob.orElse("default value"));
        System.out.println(ob.orElseGet(() -> "bye"));
        }
    }
}
