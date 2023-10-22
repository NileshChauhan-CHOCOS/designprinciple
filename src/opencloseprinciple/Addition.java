package opencloseprinciple;

public class Addition<T extends Number, S extends Number> implements CalculatorOperation{
    private final T first;
    private final S second;
    private Double result;
    public Addition(T n1, S n2){
        this.first = n1;
        this.second = n2;
    }
    public Addition<T, S> calculate(){
        result = first.doubleValue() + second.doubleValue();
        return this;
    }
    public Double getResult(){
        return this.result;
    }
}
