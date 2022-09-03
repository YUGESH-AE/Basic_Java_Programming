package Java_Se8.javaSE8Features.JavaSE8NewFeatures.LambdaExpression.Function.util;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterface {
    public static void main(String[] args) {
        Products frock = new Products(1001, "Frock", 5.0, 100);
        Products watch = new Products(2001, "Watch", 4.9, 600);
        Products shirt = new Products(3001, "Shirt", 4.5, 500);
        Products violin = new Products(4001, "Violin", 3.5, 800);
        List<Products> lst = Arrays.asList(frock, watch, shirt, violin);

        evaluavte(lst,(product -> product.getPrice()<200));
    }

    public static void evaluavte(List<Products>list, Predicate<Products> pred){
        for (Products prod:list){
            if (pred.test(prod)) {

                System.out.println(prod.toString());
            }
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

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                '}';
    }
}
