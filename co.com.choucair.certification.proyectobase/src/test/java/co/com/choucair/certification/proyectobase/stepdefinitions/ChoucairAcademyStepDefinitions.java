package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.stepdefinitions.tasks.OpenUp;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than juan wants to learn automation at the academy Choucair$")
    public void thanJuanWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("juan").wasAbleTo(OpenUp.thePage());

    }


    @When("^he search for the course Foundation Express on the choucair academy platform$")
    public void heSearchForTheCourseFoundationExpressOnTheChoucairAcademyPlatform() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^he finds the course called Foundation Express$")
    public void heFindsTheCourseCalledFoundationExpress() {
        // Write code here that turns the phrase above into concrete actions

    }
}
