package co.com.choucair.certification.proyectoentrega.tasks;

import co.com.choucair.certification.proyectoentrega.userinterface.UtestOpenUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenUp implements Task {
    private UtestOpenUpPage utestPage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage));
    }
}
