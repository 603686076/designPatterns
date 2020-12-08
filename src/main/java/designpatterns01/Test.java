package designpatterns01;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        System.out.println(director.agingMachine().getDetail());
        System.out.println(director.p2Machine().getDetail());
        System.out.println(director.flagshipAircraft().getDetail());
    }
}
