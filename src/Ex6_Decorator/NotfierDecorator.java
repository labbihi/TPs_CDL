package Ex6_Decorator;

public abstract class NotfierDecorator implements  INotifier{

    protected INotifier notifier;

    public NotfierDecorator(INotifier notifier){
        this.notifier = notifier;
    }
}
