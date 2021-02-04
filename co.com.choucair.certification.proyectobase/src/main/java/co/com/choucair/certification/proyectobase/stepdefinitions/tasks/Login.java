package co.com.choucair.certification.proyectobase.stepdefinitions.tasks;

import co.com.choucair.certification.proyectobase.stepdefinitions.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private String strUser;
    private String strPassword;

    public Login (String strUser, String strPassword){
        this.strUser = strUser;
        this.strPassword = strPassword;

    }

    public static Login onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class,strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(ChoucairLoginPage.LOGGING_BUTTON),
            Enter.theValue(strUser).into(ChoucairLoginPage.INPUT_USER),
            Enter.theValue((strPassword)).into(ChoucairLoginPage.INPUT_PASSWORD),
            Click.on(ChoucairLoginPage.ENTER_BUTTON));
    }

    public String getStrUser() {
        return strUser;
    }

    public void setStrUser(String strUser) {
        this.strUser = strUser;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }
}
