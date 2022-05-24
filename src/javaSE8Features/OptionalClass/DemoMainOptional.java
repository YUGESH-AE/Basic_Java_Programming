package javaSE8Features.OptionalClass;

import java.util.Optional;

public class DemoMainOptional {
    public static void main(String[] args) throws Exception {
        Product p1=new Product(1,"pen",200,"good");
        Product p2=new Product(2,"Rice",400,null);
        if(p2.getReview().isPresent()){
            System.out.println(p2.getReview().get().toUpperCase());
        }
        else {
            //System.out.println(p2.getReview().orElse("Nice"));
           // System.out.println(p2.getReview().orElseGet(()-> p2.getName()));
            System.out.println(p2.getReview().orElseThrow(Exception::new));
        }

       // System.out.println(Optional.ofNullable(p2).map(Product::getId));
        System.out.println(Optional.ofNullable(p1).map(Product::getPrice).filter((p)->p<=200).isPresent());
        System.out.println(Optional.ofNullable(p2).flatMap(Product::getReview).orElse("Super"));




    }

}
