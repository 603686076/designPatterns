package designpatterns01;

import java.math.BigDecimal;

//NFC
public class NFC implements Component{

    @Override
    public String type() {
        return "NFC";
    }

    @Override
    public String brand() {
        return "3C数码";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(200);
    }
}
