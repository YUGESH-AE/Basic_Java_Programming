package Java_SE8Features.JavaSE8NewFeatures.LambdaExpression;

public class LambdaParameters {
    public static void main(String[] args) {
        Addable addable = (a, b) -> a + b;
        System.out.println(addable.add(10, 20));

    }
}

interface Addable {
    int add(int a, int b);
}
