package designpatterns02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//具体产品2：实现抽象产品中的抽象方法  拍照机
public class P2Machine implements IHandset{

    private List<Component> list = new ArrayList<Component>();
    private BigDecimal price = BigDecimal.ZERO;

    private String grade;
    public P2Machine(String grade) {
        this.grade = grade;
    }

    ComponentFactory componentFactory = new ComponentFactory();

    @Override
    public IHandset assemblingMobilePhones() {
        list.add(componentFactory.produceCPU());
        price = price.add(componentFactory.produceCPU().price);
        list.add(componentFactory.produceMemory());
        price = price.add(componentFactory.produceMemory().price);
        list.add(componentFactory.produceBattery());
        price = price.add(componentFactory.produceBattery().price);
        list.add(componentFactory.produceScreen());
        price = price.add(componentFactory.produceScreen().price);
        list.add(componentFactory.produceCamera());
        price = price.add(componentFactory.produceCamera().price);
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
