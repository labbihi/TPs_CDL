package Ex6_Decorator;

public class SmsDecorator extends NotfierDecorator {


    public SmsDecorator(INotifier notifier) {
            super(notifier);
    }

    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.println("SMS : " + message);

    }
}
