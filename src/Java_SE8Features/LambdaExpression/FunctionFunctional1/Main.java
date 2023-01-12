package Java_SE8Features.LambdaExpression.FunctionFunctional1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Product>prod=Product.getall();

        for (Product i:prod){
            int k=compute(i,i1-> i1.getPrice()-100);
            System.out.println("Old Price:"+i.getPrice()+" "+"new price:"+k);
        }

    }
    public static int compute(Product p, Function<Product,Integer>f){
        return f.apply(p);
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

    public static List<Product> getall() {
        Product frock = new Product(1001, "Frock", 5.0, 100);
        Product watch = new Product(2001, "Watch", 4.9, 600);
        Product shirt = new Product(3001, "Shirt", 4.5, 500);
        Product violin = new Product(4001, "Violin", 3.5, 800);
        List<Product> prod = new ArrayList<>();
        prod.add(frock);
        prod.add(watch);
        prod.add(shirt);
        prod.add(violin);
        return prod;
    }
}

