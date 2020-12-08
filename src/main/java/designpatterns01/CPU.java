package designpatterns01;

import java.math.BigDecimal;

//CPU
public class CPU implements Component{
    @Override
    public String type() {
        return "CPU";
    }

    @Override
    public String brand(){
        return "麒麟";
    }

    @Override
    public BigDecimal price(){
        return new BigDecimal(590);
    }
}
