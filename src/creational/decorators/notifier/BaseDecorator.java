package creational.decorators.notifier;

public class BaseDecorator implements Notifier {
  private final Notifier wrappe;
  public BaseDecorator(Notifier notifier){
    this.wrappe = notifier;
  }
  
  @Override
  public void send(String message) {
    wrappe.send(message);
  }
}
