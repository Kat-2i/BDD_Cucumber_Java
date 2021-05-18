package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pages.Calculator;

public class calculatorSteps {

    private int total;

    private Calculator calculator;

    @Before
    private void init() {
        total = 0;
    }

    @Given("I have a calculator")
    public void initializeCalculator() throws Throwable {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void testAdd(int num1, int num2) throws Throwable {
        total = calculator.add(num1, num2);
    }

    @Then("the result should be {int}")
    public void validateResult(int result) throws Throwable {
        Assert.assertThat(total, Matchers.equalTo(result));
    }


    @When("I subtract {int} from {int}")
    public void iSubtractNumFromNum(int num2, int num1) {
        total = calculator.subtract(num1, num2);
    }



}
