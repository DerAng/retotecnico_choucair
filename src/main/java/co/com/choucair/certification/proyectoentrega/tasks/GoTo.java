package co.com.choucair.certification.proyectoentrega.tasks;

import co.com.choucair.certification.proyectoentrega.userinterface.UtestGoToPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoTo implements Task {
    private UtestGoToPage utestGoToPage;

    public static GoTo theForm() {
        return Tasks.instrumented(GoTo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestGoToPage.JOIN_TODAY));
    }
}
