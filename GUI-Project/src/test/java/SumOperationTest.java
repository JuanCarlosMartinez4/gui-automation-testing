import calculator.CalculatorPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        String values = "5+2=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("7"));
    }
    @Test
    public void test_doOperation_sum2And2_return4() {
        String values = "2+2=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("4"));
    }
    @Test
    public void test_doOperation_sum22And22_return44() {
        String values = "22+22=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("44"));
    }
    @Test
    public void test__doOperation__sum_22And_22__return_44() {
        String values = "-22-22=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("-44"));
    }
    @Test
    public void test__doOperation__sum_2point2And_4point2__return_6point4() {
        String values = "2.2+4.2=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("6.4"));
    }
    @Test
    public void test__doOperation__sum_0point1111111And_0point1111111__return_0point2222222() {
        String values = "0.1111111+0.1111111=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("0.2222222"));
    }
    @Test
    public void test_doOperation_subtract22And11_return11() {
        String values = "22-11=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("11"));
    }
    @Test
    public void test_doOperation_multiply10And11_return110() {
        String values = "10x11=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("110"));
    }
    @Test
    public void test_doOperation_multiply10And0_return0() {
        String values = "10x0=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("0"));
    }
    @Test
    public void test_doOperation_divide10And0_returnInfinity() {
        String values = "10÷0=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("Infinity"));
    }
    @Test
    public void test_doOperation_divide0And0_returnNaN() {
        String values = "0÷0=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("NaN"));
    }
    @Test
    public void test_doOperation_sumPoint2AndPoint5_return0point7() {
        String values = ".2+.5=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("0.7"));
    }
    @Test
    public void test_doOperation_operate1plus1plus1minus1by2plus1divide2_return2point5() {
        String values = "1+1+1-1x2+1÷2=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("1.5"));
    }
    @Test
    public void test_doOperation_multiply99999999999999And8888888888_return8point888888887999911ePlus23() {
        String values = "99999999999999x8888888888=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("8.888888887999911e+23"));
    }
}
