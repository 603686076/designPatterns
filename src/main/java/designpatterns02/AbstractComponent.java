package designpatterns02;

//抽象工厂：提供了部件的生成方法
public interface AbstractComponent {
        public Component produceCPU();
        public Component produceMemory();
        public Component produceScreen();
        public Component produceBattery();
        public Component produceCamera();
        public Component produceGPS();
        public Component produceFingerprintIdentification();
        public Component produceNFC();
}
