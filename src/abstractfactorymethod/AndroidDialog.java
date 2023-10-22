package abstractfactorymethod;

public class AndroidDialog extends Dialog{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
}
