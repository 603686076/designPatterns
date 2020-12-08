package designpatterns02;

import java.math.BigDecimal;

//部件的抽象类,为了更好的创建部件对象
public class Component {
    public String type;      //部件类型：CPU，内存，电池，屏幕，摄像头，GPS，指纹识别，NFC
    public String brand;     //品牌
    public BigDecimal price; //价格
    public Component(String type, String brand, BigDecimal price) {
        this.type = type;
        this.brand = brand;
        this.price = price;
    }


}
