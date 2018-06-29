package com.jbehave.step;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import com.jbehave.core.Calculator;

public class CalculatorStep {
	
	private Calculator calculator;
	
	@Given("a calculator")
	public void setCal() {
		this.calculator = new Calculator();
	}
	@When("i $operation $number1 and $number2")
	public void performOperation(String operation, int a, int b){
		this.calculator.performOperation(operation, a, b);
	}
	
	@Then("the outcome should be $result")
	public void outcome(long result){		
		Assert.assertEquals(result, this.calculator.getResult());	
	}
}
