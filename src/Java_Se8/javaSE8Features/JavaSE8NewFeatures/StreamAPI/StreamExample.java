package Java_Se8.javaSE8Features.JavaSE8NewFeatures.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
//        List<Products>prod=Products.getProduct();
//        prod.forEach(System.out::println);
//        List<Products>prod=Products.getProduct().stream()
//                .filter((products -> products.getPrice()<100000))
//                .sorted((a,b)->a.getName().compareTo(b.getName()))
//                .collect(Collectors.toList());
//        prod.forEach(System.out::println);

//        Products.getProduct().stream()
//                .filter(products ->products.getPrice()<100000 )
//                .sorted((p,q)-> p.getId()- q.getId())
//                .forEach(System.out::println);

        Products.getProduct().stream()
                .filter((n)->n.getPrice()<100000)
                .map((n)->n.getPrice()+5000)
                .forEach((n)-> System.out.println(n.toString()));

    }
}
class Products{
    private int id;
    private String name;
    private int price;

    public Products(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public static List<Products> getProduct(){
        List<Products>products=new ArrayList<>();
        products.add(new Products(101,"HpLaptop",75000));
        products.add(new Products(104,"Xiomi",25000));
        products.add(new Products(103,"Dell",50000));
        products.add(new Products(100,"Samsung",100000));
        products.add(new Products(99,"Mackintosh",200000));
        return products;
    }
}