package abstractfactorymethod;

public class WebDialog extends Dialog{
    public Button createButton(){
        return new HTMLButton();
    }
}
