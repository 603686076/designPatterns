package designpatterns01;

import java.math.BigDecimal;

//电池
public class Battery implements Component{

    @Override
    public String type() {
        return "电池";
    }

    @Override
    public String brand() {
        return "苹果";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(200);
    }
}
