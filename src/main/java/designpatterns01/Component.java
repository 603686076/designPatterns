package designpatterns01;

import java.math.BigDecimal;

//部件接口
//部件接口提供了部件的基本信息
public interface Component {
    String type();      //部件类型：CPU，内存，电池，屏幕，摄像头，GPS，指纹识别，NFC
    String brand();     //品牌
    BigDecimal price(); //价格
}
