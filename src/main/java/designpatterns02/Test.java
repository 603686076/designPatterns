package designpatterns02;

//如果生产新手机需要添加两个类 手机类型类和手机工厂类（PhoneFactoryN）
public class Test {
    public static void main(String[] args) {
        PhoneFactory1 phoneFactory1 = new PhoneFactory1();
        Handset p1 = phoneFactory1.producePhone();
        System.out.println(p1.getDetail());

        PhoneFactory2 phoneFactory2 = new PhoneFactory2();
        System.out.print(phoneFactory2.producePhone().getDetail());

        PhoneFactory3 phoneFactory3 = new PhoneFactory3();
        System.out.println(phoneFactory3.producePhone().getDetail());
    }
}
