package designpatterns01;

//组装包接口
//组装包接口定义组装部件的方法，以及提供最终明细的方法
public interface Builder {
    Builder appendCPU(Component component);                       //CPU
    Builder appendMemory(Component component);                    //内存
    Builder appendBattery(Component component);                   //电池
    Builder appendScreen(Component component);                    //屏幕
    Builder appendCamera(Component component);                    //摄像头
    Builder appendGPS(Component component);                       //GPS
    Builder appendFingerprintIdentification(Component component); //指纹识别
    Builder appendNFC(Component component);                       //NFC
    String getDetail();                                           //明细
}
