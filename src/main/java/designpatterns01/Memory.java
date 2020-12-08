package designpatterns01;

import java.math.BigDecimal;

//内存
public class Memory implements Component{

    @Override
    public String type() {
        return "内存";
    }

    @Override
    public String brand() {
        return "闪迪";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(200);
    }
}
