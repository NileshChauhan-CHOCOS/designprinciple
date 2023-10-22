package opencloseprinciple;

public class Main {
    public static void main(String[] args) {
        CalculatorOperation operation = new Addition<>(9, 56);
        System.out.println(operation.calculate().getResult());
        operation = new Multiplication<>(89, 90);
        System.out.println(operation.calculate().getResult());
        operation = new Division<>(84.90, 746.873);
        System.out.println(operation.calculate().getResult());
        operation = new Subtraction<>(89.374, 87);
        System.out.println(operation.calculate().getResult());
    }
}
