package designpatterns02;

public class PhoneFactory2 implements AbstractFactory{
    @Override
    public Handset producePhone() {
        return new P2Machine("照相专用机")
                .assemblingMobilePhones();
    }
}
