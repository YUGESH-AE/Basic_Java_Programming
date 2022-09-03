package Java_Se8.javaSE8Features.JavaSE8NewFeatures.LambdaExpression;

public class LambdaExample1 {
    public static void main(String[] args) {

        Shape rectangle_shape = () -> {
            System.out.println("Rectangle shape");
        };

        Shape square_shape = () -> {
            System.out.println("Square shape");
        };

        rectangle_shape.draw();
        square_shape.draw();

    }
}

interface Shape {
    void draw();
}
