package opencloseprinciple;

public class Subtraction<T extends Number, S extends Number> implements CalculatorOperation{
    private final T firstValue;
    private final S secondValue;
    private Double result;

    public Subtraction(T n1, S n2){
        this.firstValue = n1;
        this.secondValue = n2;
    }

    public Double getResult() {
        return result;
    }
    @Override
    public Subtraction<T, S> calculate() {
        this.result = firstValue.doubleValue() + secondValue.doubleValue();
        return this;
    }
}
