package Java_Se8.FunctionalProgrammingLambda.StreamAPI.Filter_Map_Reduce.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapNonPrimitive {
    public static void main(String[] args) {

        List<Product> list = Product.getProduct();

        List<Product> productList = list.stream()
                .map(p -> {
                    p.setPrice(p.getPrice() * 2);
                    return p;
                })
                .collect(Collectors.toList());

        productList.forEach(System.out::println);

        //total price
        Integer total = list.stream()
                .map(p -> {
                    return p.getPrice();
                })
                .reduce(0, (a, b) -> a + b);
        System.out.println("Total price::" + total);

    }
}

class Product {
    private Integer id;
    private String name;
    private Double rating;
    private Integer price;

    public Product(Integer id, String name, Double rating, Integer price) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public Product() {
    }

    public static List<Product> getProduct() {
        Product frock = new Product(1001, "Frock", 5.0, 100);
        Product watch = new Product(2001, "Watch", 4.9, 600);
        Product shirt = new Product(3001, "Shirt", 4.5, 500);
        Product violin = new Product(4001, "Violin", 3.5, 800);
        List<Product> lst = Arrays.asList(frock, watch, shirt, violin);
        return lst;
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
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                '}';
    }
}
