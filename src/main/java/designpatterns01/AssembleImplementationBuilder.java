package designpatterns01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//组装实现
public class AssembleImplementationBuilder implements Builder{

    private List<Component> list = new ArrayList<Component>();
    private BigDecimal price = BigDecimal.ZERO;

    Component cPU = new Component("CPU", "麒麟", new BigDecimal(590));
    Component memory = new Component("内存 ", "闪迪", new BigDecimal(200));
    Component battery = new Component("电池", "苹果",new BigDecimal(200));
    Component screen = new Component("屏幕", "三星", new BigDecimal(150));
    Component camera = new Component("摄像头", "大力光电",new BigDecimal(350));
    Component gPS = new Component("GPS", "夏新",new BigDecimal(200));
    Component fingerprintIdentification = new Component("指纹识别", "vivo",new BigDecimal(300));
    Component nFC = new Component("NFC", "3C数码",new BigDecimal(200));


    private String grade;     //手机类型
    public AssembleImplementationBuilder(String grade) {
        this.grade = grade;
    }

    @Override
    public Builder appendCPU() {
        list.add(cPU);
        price = price.add(cPU.price);
        return this;
    }

    @Override
    public Builder appendMemory() {
        list.add(memory);
        price = price.add(memory.price);
        return this;
    }

    @Override
    public Builder appendBattery() {
        list.add(battery);
        price = price.add(battery.price);
        return this;
    }

    @Override
    public Builder appendScreen() {
        list.add(screen);
        price = price.add(screen.price);
        return this;
    }

    @Override
    public Builder appendCamera() {
        list.add(camera);
        price = price.add(camera.price);
        return this;
    }

    @Override
    public Builder appendGPS() {
        list.add(gPS);
        price = price.add(gPS.price);
        return this;
    }

    @Override
    public Builder appendFingerprintIdentification() {
        list.add(fingerprintIdentification);
        price = price.add(fingerprintIdentification.price);
        return this;
    }

    @Override
    public Builder appendNFC() {
        list.add(nFC);
        price = price.add(nFC.price);
        return this;
    }

    @Override
    public String getDetail() {
        StringBuilder detail = new StringBuilder("\r\n-------------------------------------------------------\r\n" +
                "手机清单" + "\r\n" +
                "手机类型：" + grade + "\r\n" +
                "套餐价格：" + price + " 元\r\n" +
                "部件清单：\r\n");
        for (Component component: list) {
            detail.append(component.type).append("     ").append("品牌:").append(component.brand).append("、价格:").append(component.price).append("元").append("\n");
        }
        return detail.toString();
    }
}
