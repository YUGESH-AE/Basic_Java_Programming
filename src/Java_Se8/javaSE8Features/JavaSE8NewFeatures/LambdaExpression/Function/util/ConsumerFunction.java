package Java_Se8.javaSE8Features.JavaSE8NewFeatures.LambdaExpression.Function.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunction {
    public static void main(String[] args) {

        List<Produc> lst = Produc.getProductList();

        System.out.println("***** Generating Manager Report *****");
        generateReport(lst, p -> System.out
                .println(p.getId() + " : " + p.getName() + " : " + p.getRating() + " : " + p.getPrice()));

        System.out.println("\n***** Generating Customer Report *****");
        generateReport(lst, p -> System.out.println(p.getName() + " : " + p.getRating() + " : " + p.getPrice()));
    }

    public static void generateReport(List<Produc> lst, Consumer<Produc> consumer) {
        for (Produc p : lst) {
            consumer.accept(p);
        }
    }
}
class Produc {
    private Integer id;
    private String name;
    private Double rating;
    private Integer price;

    public Produc() {

    }

    public Produc(Integer id, String name, Double rating, Integer price) {
        super();
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public static List<Produc> getProductList() {
        Produc frock = new Produc(1001, "Frock", 5.0, 100);
        Produc watch = new Produc(2001, "Watch", 4.9, 600);
        Produc shirt = new Produc(3001, "Shirt", 4.5, 500);
        Produc violin = new Produc(4001, "Violin", 3.5, 800);
        List<Produc> lst = new ArrayList<>();
        lst.add(frock);
        lst.add(watch);
        lst.add(shirt);
        lst.add(violin);
        return lst;
    }
}