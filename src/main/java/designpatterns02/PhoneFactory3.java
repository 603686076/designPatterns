package designpatterns02;

public class PhoneFactory3 implements AbstractFactory{
    @Override
    public Handset producePhone() {
        return new FlagshipAircraft("旗舰机")
                .assemblingMobilePhones();
    }
}
