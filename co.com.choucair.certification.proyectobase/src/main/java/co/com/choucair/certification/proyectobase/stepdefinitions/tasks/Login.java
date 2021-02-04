package co.com.choucair.certification.proyectobase.stepdefinitions.tasks;

import co.com.choucair.certification.proyectobase.stepdefinitions.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(ChoucairLoginPage.LOGGING_BUTTON),
            Enter.theValue("1053836977 ").into(ChoucairLoginPage.INPUT_USER),
            Enter.theValue("Choucair2021*").into(ChoucairLoginPage.INPUT_PASSWORD),
            Click.on(ChoucairLoginPage.ENTER_BUTTON));
    }
}
