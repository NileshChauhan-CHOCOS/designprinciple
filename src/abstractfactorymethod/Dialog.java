package abstractfactorymethod;


public abstract class Dialog {
    public void render(){
        Button okButton = createButton();
        okButton.onClick();
    }
    public  abstract Button createButton();
}
