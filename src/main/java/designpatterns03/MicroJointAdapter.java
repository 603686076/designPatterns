package designpatterns03;

public class MicroJointAdapter extends TypeCJoint{
    MicroJoint microJoint;

    public MicroJointAdapter(MicroJoint microJoint) {
        this.microJoint = microJoint;
    }

    public void read(){
        microJoint.Read();
    }

    public void fastCharging(){
        microJoint.generalCharging();
    }
}
