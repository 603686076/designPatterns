package designpatterns01;

import com.sun.source.tree.NewArrayTree;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//组装实现
public class AssembleImplementationBuilder implements Builder{

    private List<Component> list = new ArrayList<Component>();
    private BigDecimal price = BigDecimal.ZERO;

    private String grade;     //手机类型
    public AssembleImplementationBuilder(String grade) {
        this.grade = grade;
    }

    @Override
    public Builder appendCPU(Component component) {
        list.add(component);
        price = price.add(component.price());
        return this;
    }

    @Override
    public Builder appendMemory(Component component) {
        list.add(component);
        price = price.add(component.price());
        return this;
    }

    @Override
    public Builder appendBattery(Component component) {
        list.add(component);
        price = price.add(component.price());
        return this;
    }

    @Override
    public Builder appendScreen(Component component) {
        list.add(component);
        price = price.add(component.price());
        return this;
    }

    @Override
    public Builder appendCamera(Component component) {
        list.add(component);
        price = price.add(component.price());
        return this;
    }

    @Override
    public Builder appendGPS(Component component) {
        list.add(component);
        price = price.add(component.price());
        return this;
    }

    @Override
    public Builder appendFingerprintIdentification(Component component) {
        list.add(component);
        price = price.add(component.price());
        return this;
    }

    @Override
    public Builder appendNFC(Component component) {
        list.add(component);
        price = price.add(component.price());
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
            detail.append(component.type()).append("     ").append("品牌:").append(component.brand()).append("、价格:").append(component.price()).append("元").append("\n");
        }
        return detail.toString();
    }
}
