package creational.decorators.notifier;

public class SMSDecorator extends BaseDecorator{
  public SMSDecorator(Notifier notifier) {
    super(notifier);
  }
  
  @Override
  public void send(String message) {
    super.send(message);
  }
}
