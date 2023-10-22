package opencloseprinciple;

import java.security.InvalidParameterException;

public class Calculator {
    public void calculate(CalculatorOperation operation){
        if (operation == null){
            throw new InvalidParameterException("Cannot perform operation");
        }
        operation.calculate();
    }
}
