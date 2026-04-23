package Ex6;

public class EmailSlackNotifier extends Notifier{

    @Override
    public void send(String message) {
        System.out.println("Email + Slack : " + message);
    }
}
