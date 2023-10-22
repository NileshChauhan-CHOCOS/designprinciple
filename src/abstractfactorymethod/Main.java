package abstractfactorymethod;

public class Main {
    public static void main(String[] args) {
        Dialog dialog = new WebDialog();
        dialog.render();
        dialog = new WindowsDialog();
        dialog.render();
        dialog = new AndroidDialog();
        dialog.render();
    }
}
