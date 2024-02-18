package day07.oop.phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone mi=new Phone();
        mi.brand="小米";
        mi.color='白';
        mi.price=4999;
        System.out.println(mi.brand+"--"+mi.color+"--"+mi.price);
        mi.call("雷军");
        mi.sendMessage();
        Phone huaWei=new Phone();
        huaWei.brand="华为";
        huaWei.color='黑';
        huaWei.price=6999;
        System.out.println(huaWei.brand+"--"+huaWei.color+"--"+huaWei.price);
        huaWei.call("任正非");
        huaWei.sendMessage();
    }
}
