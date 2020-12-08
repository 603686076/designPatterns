package designpatterns01;

import java.math.BigDecimal;

//屏幕
public class Camera implements Component{
    @Override
    public String type() {
        return "摄像头";
    }

    @Override
    public String brand() {
        return "大力光电";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(350);
    }
}
