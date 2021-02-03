package co.com.choucair.certification.proyectobase.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than juan wants to learn automation at the academy Choucair$")
    public void thanJuanWantsToLearnAutomationAtTheAcademyChoucair() {
        // Write code here that turns the phrase above into concrete actions

    }


    @When("^he search for the course Workshop de Automatización on the choucair academy platform$")
    public void heSearchForTheCourseWorkshopDeAutomatizaciónOnTheChoucairAcademyPlatform() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^he finds the course called Workshop de Automatización$")
    public void heFindsTheCourseCalledWorkshopDeAutomatización() {
        // Write code here that turns the phrase above into concrete actions

    }
}
