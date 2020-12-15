package designpatterns04;

public class MessageSourceManager {

    public static void main(String[] args) {
        MessageSource messageSource = new MessageSource("部件质量出现问题");   //部件质量出现问题消息源
        QualityController qualityController = new QualityController();      //一个质管员订阅者
        Worker worker = new Worker();                                       //一个工人订阅者

        messageSource.addSubscriber(qualityController);                     //为此消息源添加一个质管员订阅者
        messageSource.addSubscriber(worker);                                //为此消息源添加一个工人订阅者

//        messageSource.removeSubscriber(worker);                           //移除一个订阅者
        messageSource.noticeSubscribers();                                  //通知所有此消息订阅者消息产生


    }

}
