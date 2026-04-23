package Ex6;

public class EmailSmsNotifier extends Notifier{



    @Override
    public void send(String message) {
        System.out.println("Email + SMS : " + message);
    }
}
