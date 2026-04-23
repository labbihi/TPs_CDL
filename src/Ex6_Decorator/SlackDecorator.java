package Ex6_Decorator;

public class SlackDecorator extends NotfierDecorator{


    public SlackDecorator(INotifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        notifier.send(message);
        System.out.println("Slack : " + message);
    }
}
