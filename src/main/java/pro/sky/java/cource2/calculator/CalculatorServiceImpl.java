package pro.sky.java.cource2.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    private int number1;
    private int number2;

    @Override
    public int getCalculateAddition(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public int getCalculateSubtraction(int number1, int number2) {
        return number1 - number2;
    }

    @Override
    public int getCalculateMultiplication(int number1, int number2) {
        return number1 * number2;
    }

    @Override
    public int getCalculateDivision(int number1, int number2) {
        return number1 / number2;
    }
}
