package Java_Fundamentals.Enum.EnumUdemyEg;

public class UdemyEnum {
    public static void main(String[] args) {
        Laptop.HEWLETPAKRD.setPrice(489994004);
        System.out.println(Laptop.HEWLETPAKRD+"-"+Laptop.HEWLETPAKRD.getPrice());
        System.out.println(Laptop.SAMSUNG+"-"+Laptop.SAMSUNG.getPrice());
    }
}


enum Laptop {
    MACKBOOK(300), HEWLETPAKRD, SAMSUNG(3666), TOSHIBA(3663), MICROSOFT(74747);

    private int price;

    Laptop() {
    }

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
