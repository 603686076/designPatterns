package designpatterns01;

import java.math.BigDecimal;

//屏幕
public class Screen implements Component{
    @Override
    public String type() {
        return "屏幕";
    }

    @Override
    public String brand() {
        return "三星";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(150);
    }
}
