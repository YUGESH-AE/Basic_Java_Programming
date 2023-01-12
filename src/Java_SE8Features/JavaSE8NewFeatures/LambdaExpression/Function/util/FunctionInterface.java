package Java_SE8Features.JavaSE8NewFeatures.LambdaExpression.Function.util;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {

        List<Products> lst = Products.getProductList();
        for (Products pi:lst){
            int price=function(pi,(p1)->p1.getPrice()-100);
            System.out.println("old price::"+pi.getPrice()+"new price::"+price);
        }
    }
    public static int function(Products products, Function<Products,Integer>fs){
        return fs.apply(products);
    }
}




class Products {
    private Integer id;
    private String name;
    private Double rating;
    private Integer price;

    public Products() {

    }

    public Products(Integer id, String name, Double rating, Integer price) {
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

    public static List<Products> getProductList() {
        Products frock = new Products(1001, "Frock", 5.0, 400);
        Products watch = new Products(2001, "Watch", 4.9, 800);
        Products shirt = new Products(3001, "Shirt", 4.5, 500);
        Products violin = new Products(4001, "Violin", 3.5, 900);
        List<Products> lst = new ArrayList<>();
        lst.add(frock);
        lst.add(watch);
        lst.add(shirt);
        lst.add(violin);
        return lst;
    }
}