package Ex6;

public class Main {

    public static void main(String[] args) {
        Notifier notifier = new EmailSmsSlackNotifier(); //EmailSlackNotifier(); //EmailSmsNotifier(); //Notifier();

        notifier.send("Hello World");


    }
}
