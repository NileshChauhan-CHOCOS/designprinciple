package opencloseprinciple;

public class Division<T extends Number, S extends Number> implements CalculatorOperation{
    private final T firstValue;
    private final S secondValue;
    private Double result;
    public Division(T n1, S n2){
        this.firstValue = n1;
        this.secondValue = n2;
    }
    @Override
    public Division<T, S> calculate(){
        try{
            if(secondValue.doubleValue() == 0){
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            this.result = this.firstValue.doubleValue()/this.secondValue.doubleValue();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }
    public Double getResult(){
        return this.result;
    }
}
