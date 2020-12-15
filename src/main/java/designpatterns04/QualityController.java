package designpatterns04;

//质管员
public class QualityController implements Subscriber{
    @Override
    public void whenAMessageIsReceived(String message) {
        if (message.equals("部件质量出现问题")){
            whenThereAreProblemsInPartsProduction();
        }
    }

    private void whenThereAreProblemsInPartsProduction(){
        System.out.println("部件质量出现问题，我是质管员，我已记录！");
    }
}
