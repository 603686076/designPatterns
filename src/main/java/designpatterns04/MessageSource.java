package designpatterns04;

import java.util.ArrayList;
import java.util.List;

public class MessageSource {
    public MessageSource(String message) {
        this.message = message;
    }

    String message;
    List<Subscriber> list = new ArrayList<Subscriber>();

    public void addSubscriber(Subscriber subscriber){
        list.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        list.remove(subscriber);
    }

    public void noticeSubscribers(){
        for (Subscriber subscriber: list){
            subscriber.whenAMessageIsReceived(this.message);
        }
    }
}
