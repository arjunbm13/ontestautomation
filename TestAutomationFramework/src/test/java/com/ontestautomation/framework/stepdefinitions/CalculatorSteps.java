package com.ontestautomation.framework.stepdefinitions;

import org.junit.Assert;

import com.ontestautomation.framework.calculator.Calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorSteps {
	
	Calculator calculator;
	
	@Given("^I have a Calculator$")
    public void iHaveACalculator() {
 
        calculator = new Calculator();
    }
 
//    @When("^I add integers 3 and 5$")
//    public void iAddIntegersThreeAndFive() {
// 
//        calculator.add(3,5);
//    }
	
	@When("^I add integers (\\d+) and (\\d+)$")
	public void iAddIntegers(int x, int y) {
		calculator.add(x,y);
	}
 
    @Then("^the sum is (\\d+)$")
    public void theSumIs(int sum) {
        Assert.assertEquals(calculator.getResult(), sum);
    }
}