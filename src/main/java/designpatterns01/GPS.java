package designpatterns01;

import java.math.BigDecimal;

//GPS
public class GPS implements Component{
    @Override
    public String type() {
        return "GPS";
    }

    @Override
    public String brand() {
        return "夏新";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(200);
    }
}
