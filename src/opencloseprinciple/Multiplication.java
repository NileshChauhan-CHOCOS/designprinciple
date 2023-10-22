package opencloseprinciple;

public class Multiplication<T extends Number, S extends Number> implements CalculatorOperation{
    private final T firstValue;
    private final S secondValue;
    private double result;
    public Multiplication(T n1, S n2){
        this.firstValue = n1;
        this.secondValue = n2;
    }
    public Multiplication<T, S> calculate(){
        this.result = firstValue.doubleValue()*secondValue.doubleValue();
        return this;
    }
    public Double getResult(){
        return this.result;
    }
}
