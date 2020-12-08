package designpatterns01;

//组装包接口
//组装包接口定义组装部件的方法，以及提供最终明细的方法
public interface Builder {
    Builder appendCPU();                       //CPU
    Builder appendMemory();                    //内存
    Builder appendBattery();                   //电池
    Builder appendScreen();                    //屏幕
    Builder appendCamera();                    //摄像头
    Builder appendGPS();                       //GPS
    Builder appendFingerprintIdentification(); //指纹识别
    Builder appendNFC();                       //NFC
    String getDetail();                                           //明细
}
