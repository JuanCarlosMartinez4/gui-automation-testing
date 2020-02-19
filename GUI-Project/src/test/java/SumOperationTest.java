import calculator.CalculatorPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SumOperationTest {
    CalculatorPage calculatorPage;
    @Before
    public void setUp() {
        calculatorPage = new CalculatorPage();
    }
    @After
    public void tearDown() {

    }
    @Test
    public void test_doOperation_sum5And2_return7() {
        List values = new ArrayList();
        values.add('5');
        values.add('+');
        values.add('2');
        values.add('=');
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("7"));
    }
    @Test
    public void test_doOperation_sum2And2_return4() {
        List values = new ArrayList();
        values.add('2');
        values.add('+');
        values.add('2');
        values.add('=');
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("4"));
    }
    @Test
    public void test_doOperation_sum22And22_return44() {
        List values = new ArrayList();
        values.add('2');
        values.add('2');
        values.add('+');
        values.add('2');
        values.add('2');
        values.add('=');
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("44"));
    }
    @Test
    public void test__doOperation__sum_22And_22__return_44() {
        List values = new ArrayList();
        values.add('-');
        values.add('2');
        values.add('2');
        values.add('-');
        values.add('2');
        values.add('2');
        values.add('=');
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("-44"));
    }
    @Test
    public void test__doOperation__sum_2point2And_4point2__return_6point4() {
        List values = new ArrayList();
        values.add('2');
        values.add('.');
        values.add('2');
        values.add('+');
        values.add('4');
        values.add('.');
        values.add('2');
        values.add('=');
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("6.4"));
    }
    @Test
    public void test__doOperation__sum_0point1111111And_0point1111111__return_0point2222222() {
        List values = new ArrayList();
        values.add('0');
        values.add('.');
        values.add('1');
        values.add('1');
        values.add('1');
        values.add('1');
        values.add('1');
        values.add('1');
        values.add('1');
        values.add('+');
        values.add('0');
        values.add('.');
        values.add('1');
        values.add('1');
        values.add('1');
        values.add('1');
        values.add('1');
        values.add('1');
        values.add('1');
        values.add('=');
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("0.2222222"));
    }
    @Test
    public void test_doOperation_subtract22And11_return11() {
        List values = new ArrayList();
        values.add('2');
        values.add('2');
        values.add('-');
        values.add('1');
        values.add('1');
        values.add('=');
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("11"));
    }
    @Test
    public void test_doOperation_multiply10And11_return110() {
        List values = new ArrayList();
        values.add('1');
        values.add('0');
        values.add('x');
        values.add('1');
        values.add('1');
        values.add('=');
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("110"));
    }
    @Test
    public void test_doOperation_multiply10And0_return0() {
        List values = new ArrayList();
        values.add('1');
        values.add('0');
        values.add('x');
        values.add('0');
        values.add('=');
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("0"));
    }
    @Test
    public void test_doOperation_divide10And0_returnInfinity() {
        List values = new ArrayList();
        values.add('1');
        values.add('0');
        values.add('÷');
        values.add('0');
        values.add('=');
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("Infinity"));
    }
    @Test
    public void test_doOperation_divide0And0_returnNaN() {
        List values = new ArrayList();
        values.add('0');
        values.add('÷');
        values.add('0');
        values.add('=');
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("NaN"));
    }
    @Test
    public void test_doOperation_sumPoint2AndPoint5_return0point7() {
        List values = new ArrayList();
        values.add('.');
        values.add('2');
        values.add('+');
        values.add('.');
        values.add('5');
        values.add('=');
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("0.7"));
    }
    @Test
    public void test_doOperation_operate1plus1plus1minus1by2plus1divide2_return2point5() {
        List values = new ArrayList();
        values.add('1');
        values.add('+');
        values.add('1');
        values.add('+');
        values.add('1');
        values.add('-');
        values.add('1');
        values.add('x');
        values.add('2');
        values.add('+');
        values.add('1');
        values.add('÷');
        values.add('2');
        values.add('=');
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("1.5"));
    }
    @Test
    public void test_doOperation_multiply99999999999999And8888888888_return8point888888887999911ePlus23() {
        List values = new ArrayList();
        values.add('9');
        values.add('9');
        values.add('9');
        values.add('9');
        values.add('9');
        values.add('9');
        values.add('9');
        values.add('9');
        values.add('9');
        values.add('9');
        values.add('9');
        values.add('9');
        values.add('9');
        values.add('9');
        values.add('x');
        values.add('8');
        values.add('8');
        values.add('8');
        values.add('8');
        values.add('8');
        values.add('8');
        values.add('8');
        values.add('8');
        values.add('8');
        values.add('8');
        values.add('=');
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("8.888888887999911e+23"));
    }
}
