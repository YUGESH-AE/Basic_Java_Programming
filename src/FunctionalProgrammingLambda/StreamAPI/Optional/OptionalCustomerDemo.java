package FunctionalProgrammingLambda.StreamAPI.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalCustomerDemo {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "Ravi", null);
        /**
         * Empty:
         * it will create a empty object
         */
        Optional<Customer> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);
        /**
         * of method
         * it will check for null object if null it will throw null pointer exception
         */
        Optional<String> optionalOf = Optional.of(customer.getName());
        System.out.println(optionalOf.get());
        /**
         * ofNullable method(combination of empty and of)
         * it will check for null object if it is null then ot will provide empty optional
         * instead of null pointer exception
         */
        Optional<String> optionalOfNullable = Optional.ofNullable(customer.getEmail());
//        if(optionalOfNullable.isPresent()) {
//            System.out.println(optionalOfNullable.get());
//        }
        System.out.println(optionalOfNullable.orElse("default@gmail.com"));
        System.out.println(optionalOfNullable.map(String::toUpperCase).orElseGet(() -> "default@gmail"));
//        System.out.println(optionalOfNullable.orElseThrow(()->new RuntimeException()));

        List<Customer> list = new ArrayList<>();
        list.add(new Customer(101, "Ravi", null));
        list.add(new Customer(100, "Yugesh", "Yugesh@gmail"));
        list.add(new Customer(102, "Sanjay", "Sanjay@gmail"));

        list.stream()
                .filter((customer1 -> customer1.getEmail().equals("gmail")))
                .findAny()
                .orElseThrow(() -> new RuntimeException());

    }
}

class Customer {

    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Customer() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
