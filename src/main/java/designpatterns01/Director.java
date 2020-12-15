package designpatterns01;

//在此可以组装需要的新机型,只要添加一个新手机的组装方法
public class Director {

    public Builder agingMachine(){  
        return new ConcreteBuilder("老年机")
                .appendCPU()
                .appendMemory()
                .appendBattery()
                .appendScreen();
    }

    public Builder p2Machine(){
        return new ConcreteBuilder("摄像专用机")
                .appendCPU()
                .appendMemory()
                .appendBattery()
                .appendScreen()
                .appendCamera();
    }

    public Builder flagshipAircraft(){
        return new ConcreteBuilder("旗舰机")
                .appendCPU()
                .appendMemory()
                .appendBattery()
                .appendScreen()
                .appendCamera()
                .appendGPS()
                .appendFingerprintIdentification()
                .appendNFC();
    }
}