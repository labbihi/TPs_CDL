package Ex6_Decorator;

public class Main {
    public static void main(String[] args) {
        INotifier notifier = new EmailNotifier();

        notifier =   new WhatsAppDecorator(notifier);

        notifier = new SlackDecorator(notifier);


        notifier.send("Hello World");
    }
}
