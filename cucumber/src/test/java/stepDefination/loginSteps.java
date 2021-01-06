package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

@Given("I want to write a step with precondition")
public void i_want_to_write_a_step_with_precondition() {
    System.out.println("I want to write a step with precondition");
}

@And("some other precondition")
public void some_other_precondition() {
    System.out.println("some other precondition");
    }

@Then("I validate the outcomes")
public void i_validate_the_outcomes() {
	System.out.println("yet another action");
}

@And("check more outcomes")
public void check_more_outcomes() {
	System.out.println("yet another action");
}

}
