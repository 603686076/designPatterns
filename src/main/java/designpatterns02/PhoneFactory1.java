package designpatterns02;

//手机工厂
public class PhoneFactory1 implements AbstractFactory{
    @Override
    public IHandset producePhone(){
        return new AgingMachine("老年机")
                .assemblingMobilePhones();
    }
}
