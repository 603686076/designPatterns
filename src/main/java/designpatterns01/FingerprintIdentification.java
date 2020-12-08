package designpatterns01;

import java.math.BigDecimal;

//指纹识别
public class FingerprintIdentification implements Component{
    @Override
    public String type() {
        return "指纹识别";
    }

    @Override
    public String brand() {
        return "vivo";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(300);
    }
}
