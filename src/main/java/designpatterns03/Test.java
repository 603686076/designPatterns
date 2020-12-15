package designpatterns03;

public class Test {
    public static void main(String[] args) {
        /*定义一个手机端的typeCUSB插口*/
        TypeCUSB typeCUSB = new TypeCUSB();
        /*定义一个microJoint, 即micro类型的充电器接头*/
        MicroJoint microJoint = new MicroJoint();
        /*定义一个typeCJoint, 即typeC类型的充电器接头*/
        TypeCJoint typeCJoint = new TypeCJoint();
        /*将micro类型的充电器接头的行为适配为标准type-c类型的行为*/
        MicroJointAdapter microAdapterJoint = new MicroJointAdapter(microJoint);


        typeCUSB.fits(microAdapterJoint);
        typeCUSB.fits(typeCJoint);
    }
}
