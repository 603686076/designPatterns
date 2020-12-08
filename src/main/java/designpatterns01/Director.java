package designpatterns01;

//在此可以组装需要的新机型,只要添加一个新手机的组装方法
public class Director {

    public Builder agingMachine(){  
        return new AssembleImplementationBuilder("老年机")
                .appendCPU(new CPU())
                .appendMemory(new Memory())
                .appendBattery(new Battery())
                .appendScreen(new Screen());
    }

    public Builder p2Machine(){
        return new AssembleImplementationBuilder("摄像专用机")
                .appendCPU(new CPU())
                .appendMemory(new Memory())
                .appendBattery(new Battery())
                .appendScreen(new Screen())
                .appendCamera(new Camera());
    }

    public Builder flagshipAircraft(){
        return new AssembleImplementationBuilder("旗舰机")
                .appendCPU(new CPU())
                .appendMemory(new Memory())
                .appendBattery(new Battery())
                .appendScreen(new Screen())
                .appendCamera(new Camera())
                .appendGPS(new GPS())
                .appendFingerprintIdentification(new FingerprintIdentification())
                .appendNFC(new NFC());
    }
}
