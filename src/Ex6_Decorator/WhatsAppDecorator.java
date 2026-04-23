package Ex6_Decorator;

public class WhatsAppDecorator extends NotfierDecorator{

    public WhatsAppDecorator(INotifier notifier) {
        super(notifier);
    }

    // send function


    @Override
    public void send(String message) {
        notifier.send(message);
    System.out.println("WhatsApp : " + message);
    }
}
