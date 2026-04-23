package Ex6_Decorator;

public class EmailNotifier implements INotifier {

    @Override
    public void send(String message) {
        System.out.println("Email : " + message);
    }
}
