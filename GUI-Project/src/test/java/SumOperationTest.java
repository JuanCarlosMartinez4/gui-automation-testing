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
    public void test_doOperation_sum0point0000000001plus0point0000000001_return2e_10() {
        String values = "0.0000000001+0.0000000001=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("2e-10"));
    }

    @Test
    public void test__doOperation__sum_0point1111111And_0point1111111__return_0point2222222() {
        String values = "0.1111111+0.1111111=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("0.2222222"));
    }

    @Test
    public void test_doOperation_sumPoint2AndPoint5_return0point7() {
        String values = ".2+.5=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("0.7"));
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
    public void test_doOperation_multiply999999999999999999999999999999x2_return2eplus30() {
        String values = "999999999999999999999999999999x2=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("2e+30"));
    }

    @Test
    public void test_doOperation_multiply999999999999999999999999999999x999999999999999999999999999999_return1eplus60() {
        String values = "999999999999999999999999999999x999999999999999999999999999999=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("1.0000000000000001e+60"));
    }

    @Test
    public void test_doOperation_multiply99999999999999And8888888888_return8point888888887999911ePlus23() {
        String values = "99999999999999x8888888888=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("8.888888887999911e+23"));
    }

    @Test
    public void test_doOperation_multiply0pointMultiply2_return0() {
        String values = "0.x2=";
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
    public void test_doOperation_operate1plus1plus1minus1by2plus1divide2_return2point5() {
        String values = "1+1+1-1x2+1÷2=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("1.5"));
    }

    @Test
    public void test_doOperation_divide2222222222divide0000000000point1_return2222222222divide0000000000point1() {
        String values = "2222222222÷0000000000.1=";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is("2222222222÷0000000000.1"));
    }

    @Test
    public void test_doOperation_cleanScreenGiven99999999999999_screenCleaned() {
        String values = "99999999999999C";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is(""));
    }

    @Test
    public void test_doOperation_pointPlusPointPlusPointPlus_returnPointPlusPointPlusPointPlus() {
        String values = ".+.+.+";
        String actual = calculatorPage.doOperation(values);
        assertThat(actual, is(".+.+.+"));
    }
}
