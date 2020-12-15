package designpatterns04;

//工人
public class Worker implements Subscriber{
    @Override
    public void whenAMessageIsReceived(String message) {
        if (message.equals("部件质量出现问题")){
            whenThereAreProblemsInPartsProduction();
        }
    }

    private void whenThereAreProblemsInPartsProduction(){
        System.out.println("部件质量出现问题，我是工人，我去核查！");
    }
}
