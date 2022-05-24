package javaSE8Features.OptionalClass;

import java.util.Optional;

public class Product {
    private int id;
    private String name;
    private int price;
    private String review;

    public Product(int id, String name, int price, String review) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.review = review;
    }

    public Product() {
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

    public Optional<String> getReview() {
        return Optional.ofNullable(review);
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", review='" + review + '\'' +
                '}';
    }
}

