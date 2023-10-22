package abstractfactorymethod;

public class AndroidButton implements Button {

    @Override
    public void render() {
        System.out.println("Android render");
    }

    @Override
    public void onClick() {
        System.out.println("Android Button ");
    }
}
