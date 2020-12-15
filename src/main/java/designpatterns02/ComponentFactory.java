package designpatterns02;

import java.math.BigDecimal;

//部件工厂
public class ComponentFactory {

    public Component produceCPU() {



        
        Component cPU = new Component("CPU", "麒麟", new BigDecimal(590));
        return cPU;
    }

    public Component produceMemory() {
        Component memory = new Component("内存 ", "闪迪", new BigDecimal(200));
        return memory;
    }

    public Component produceScreen() {
        Component screen = new Component("屏幕", "三星", new BigDecimal(150));
        return screen;
    }


    public Component produceBattery() {
        Component battery = new Component("电池", "苹果",new BigDecimal(200));
        return battery;
    }


    public Component produceCamera() {
        Component camera = new Component("摄像头", "大力光电",new BigDecimal(350));
        return camera;
    }


    public Component produceGPS() {
        Component gPS = new Component("GPS", "夏新",new BigDecimal(200));
        return gPS;
    }


    public Component produceFingerprintIdentification() {
        Component fingerprintIdentification = new Component("指纹识别", "vivo",new BigDecimal(300));
        return fingerprintIdentification;
    }


    public Component produceNFC() {
        Component nFC = new Component("NFC", "3C数码",new BigDecimal(200));
        return nFC;
    }
}
