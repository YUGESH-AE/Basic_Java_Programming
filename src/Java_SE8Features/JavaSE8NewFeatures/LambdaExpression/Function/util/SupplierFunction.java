package Java_SE8Features.JavaSE8NewFeatures.LambdaExpression.Function.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFunction {
    public static void main(String[] args) {
        List<? extends Product1> lst = Product1.getProductList();
        for (Product1 e : lst) {
            generate(() -> e);
        }
    }

    public static void generate(Supplier<? extends Product1> supplier) {
        System.out.println(supplier.get().getName()+":"+supplier.get().generateDiscoundSlip());
    }
}
class Product1 {
    private Integer id;
    private String name;
    private Double rating;
    private Integer price;

    public Product1() {

    }

    public Product1(Integer id, String name, Double rating, Integer price) {
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

    public double generateDiscoundSlip() {
        System.out.println("Product1 price");
        return this.getPrice();		//no increment
    }

    public static List<Product1> getProductList() {
        Product1 frock = new BestProduct(1001, "Frock", 5.0, 800);
        Product1 watch = new Product1(2001, "Watch", 4.9, 600);
        Product1 shirt = new ResonableProduct(3001, "Shirt", 4.5, 400);
        Product1 violin = new Product1(4001, "Violin", 3.5, 700);
        List<Product1> lst = new ArrayList<>();
        lst.add(frock);
        lst.add(watch);
        lst.add(shirt);
        lst.add(violin);
        return lst;
    }
}

class BestProduct extends Product1
{
    public BestProduct(Integer id, String name, Double rating, Integer price){
        super(id,name,rating,price);
    }
    @Override
    public double generateDiscoundSlip() {
        System.out.println("Discounted price for the bestproduct");
        return (super.getPrice()/2);
    }


}

class ResonableProduct extends Product1
{
    public ResonableProduct(Integer id, String name, Double rating, Integer price){
        super(id,name,rating,price);
    }
    @Override
    public double generateDiscoundSlip() {
        System.out.println("Discounted price for the reasonable product");
        return (super.getPrice()-100);
    }


}