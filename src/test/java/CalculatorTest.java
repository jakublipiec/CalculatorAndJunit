import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{

    Calculator calculator;

    @BeforeEach
    void setUp()
    {
        calculator = new Calculator();
    }

    @Test
    void getResult()
    {
    }

    @Test
    void addition()
    {
        assertEquals("0", calculator.addition(0,0), "0 + 0 = 0");
        assertEquals("10", calculator.addition(8,2), "8 + 2 = 10");
        assertEquals("-10", calculator.addition(-8,-2), "(-8) + (-2) = -10");
        assertEquals("-2", calculator.addition(6, -8), "6 + (-8) = -2");
        assertEquals("-2", calculator.addition(-8, 6), "-8 + 6 = -2");
        assertEquals("14.444", calculator.addition(12.22, 2.224), "12.22 + 2.224 = 14.444");
    }

    @Test
    void subtraction()
    {
        assertEquals("0", calculator.subtraction(0, 0), "0 - 0 = 0");
        assertEquals("6", calculator.subtraction(8, 2), "8 - 2 = 6");
        assertEquals("-6", calculator.subtraction(-8, -2), "(-8) - (-2) = -6");
        assertEquals("14", calculator.subtraction(6, -8), "6 - (-8) = 14");
        assertEquals("-14", calculator.subtraction(-8, 6), "-8 - 6 = -14");
        assertEquals("9.996", calculator.subtraction(12.22, 2.224), "12.22 - 2.224 = 9.996");
    }

    @Test
    void multiplication()
    {
        assertEquals("0", calculator.multiplication(0, 0), "0 * 0 = 0");
        assertEquals("16", calculator.multiplication(8, 2), "8 * 2 = 16");
        assertEquals("16", calculator.multiplication(-8, -2), "(-8) * (-2) = 16");
        assertEquals("-48", calculator.multiplication(6, -8), "6 * (-8) = -48");
        assertEquals("-48", calculator.multiplication(-8, 6), "-8 * 6 = -48");
        assertEquals("27.17728", calculator.multiplication(12.22, 2.224), "12.22 * 2.224 = 27.17728");
    }

    @Test
    void division()
    {
        assertEquals("Cannot divide by zero!", calculator.division(0, 0), "0 / 0 = Cannot divide by zero!");
        assertEquals("4", calculator.division(8, 2), "8 / 2 = 4");
        assertEquals("4", calculator.division(-8, -2), "(-8) / (-2) = 4");
        assertEquals("-0.75", calculator.division(6, -8), "6 / (-8) = -0.75");
        assertEquals("-1.33", calculator.division(-8, 6), "-8 / 6 = -1.33");
        assertEquals("5.49", calculator.division(12.22, 2.224), "12.22 / 2.224 = 5.45");
    }

    @Test
    void isDivisorEqualZero()
    {
        assertFalse(calculator.isDivisorEqualZero(1));
        assertTrue(calculator.isDivisorEqualZero(0));
    }
}