package Ex6;

public class EmailSmsSlackNotifier extends Notifier{
    @Override
    public void send(String message) {
        System.out.println("Email + SMS + SLACK : " + message);
    }
}
