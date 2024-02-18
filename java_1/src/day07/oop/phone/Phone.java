package day07.oop.phone;

public class Phone {
    String brand;
    char color;
    double price;
    public void call(String name){
        System.out.println("打电话给"+name);
    }
    public void sendMessage() {
        System.out.println("群发短信");
    }
}
