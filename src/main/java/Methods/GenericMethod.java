package Methods;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class GenericMethod {
    protected double firstNumber;
    protected double secondNumber;

    public abstract double getAnswer();
}
