package designpatterns02;

public class PhoneFactory3 implements AbstractFactory{
    @Override
    public IHandset producePhone() {
        return new FlagshipAircraft("旗舰机")
                .assemblingMobilePhones();
    }
}
