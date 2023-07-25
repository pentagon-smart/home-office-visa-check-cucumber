package gov.uk.check.visa.cucumber.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VisaConfirmationSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I am on start page")
    public void iAmOnStartPage() {
        new StartPage().clickStartNow();
    }

    @And("I select a nationality {string}")
    public void iSelectANationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I select {string}")
    public void iSelect(String reason) {
        new ReasonForTravelPage().selectReasonForVisit(reason);
    }

    @And("I click on next continue button")
    public void iClickOnNextContinueButton() {
        new ReasonForTravelPage().clickNextStepButton();
    }


    @And("I select duration {string}")
    public void iSelectDuration(String duration) {
        new DurationOfStayPage().selectLengthOfStay(duration);
    }
    @And("I click on next step continue button")
    public void iClickOnNextStepContinueButton() {
        new DurationOfStayPage().clickNextStepButton();
    }


    @Then("I should see the result message {string}")
    public void iShouldSeeTheResultMessage(String expectedMessage) {
        Assert.assertEquals("",expectedMessage,new ResultPage().getResultMessage(expectedMessage));
    }


    @Then("I should see the result msg {string}")
    public void iShouldSeeTheResultMsg(String expectedMsg) {
        Assert.assertEquals("Result is not displayed",expectedMsg,new ResultPage().getResultMsg(expectedMsg));
    }


    @Then("I should see the result messages {string}")
    public void iShouldSeeTheResultMessages(String expectedMessages) {
        Assert.assertEquals("Result is not displayed",expectedMessages,new ResultPage().getResultMsg1(expectedMessages));
    }
}
