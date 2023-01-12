package Java_SE8Features.LambdaExpression.ConsumerFunctional1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<Product> lst = Product.getProductList();
        System.out.println("***** Generating Manager Report *****");
        consume(lst,product -> System.out.println(product.getId()+" "+product.getPrice()));

    }
    public static void consume(List<Product> p, Consumer<Product> c){
        for (Product i:p){
            c.accept(i);
        }
    }
}

class Product {
    private Integer id;
    private String name;
    private Double rating;
    private Integer price;

    public Product() {

    }

    public Product(Integer id, String name, Double rating, Integer price) {
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

    public static List<Product> getProductList() {
        Product frock = new Product(1001, "Frock", 5.0, 100);
        Product watch = new Product(2001, "Watch", 4.9, 600);
        Product shirt = new Product(3001, "Shirt", 4.5, 500);
        Product violin = new Product(4001, "Violin", 3.5, 800);
        List<Product> lst = new ArrayList<>();
        lst.add(frock);
        lst.add(watch);
        lst.add(shirt);
        lst.add(violin);
        return lst;
    }
}