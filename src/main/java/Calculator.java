import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator
{
    private String result;

    public Calculator() {}

    public String getResult()
    {
        return this.result;
    }

    public String addition(double firstParameter, double secondParameter)
    {
        result = String.valueOf(BigDecimal.valueOf(firstParameter).add(BigDecimal.valueOf(secondParameter)));
        deleteRedundantZero();
        return result;
    }

    public String subtraction(double firstParameter, double secondParameter)
    {
        result = String.valueOf(BigDecimal.valueOf(firstParameter).subtract(BigDecimal.valueOf(secondParameter)));
        deleteRedundantZero();
        return result;
    }

    public String multiplication(double firstParameter, double secondParameter)
    {
        result =  String.valueOf(BigDecimal.valueOf(firstParameter).multiply(BigDecimal.valueOf(secondParameter)));
        deleteRedundantZero();
        return result;
    }

    public String division(double firstParameter, double secondParameter)
    {
        if (isDivisorEqualZero(secondParameter)) return "Cannot divide by zero!";
        else
        {
            result = BigDecimal.valueOf(firstParameter).divide(BigDecimal.valueOf(secondParameter), 2, RoundingMode.HALF_UP).toPlainString();
            deleteRedundantZero();
            return result;
        }
    }

    public boolean isDivisorEqualZero(double secondParameter)
    {
        return (secondParameter == 0);
    }

    private void deleteLastCharOfResult()
    {
        int lastIndex = result.length()-1;

        result = result.substring(0, lastIndex);
    }

    private void deleteRedundantZero()
    {
        while (result.charAt(result.length()-1) == '0' ||
                result.charAt(result.length()-1) == '.')
        {
            if (result.charAt(result.length()-1) == '.')
            {
                deleteLastCharOfResult();
                break;
            }
            deleteLastCharOfResult();
        }
    }
}
