package co.com.choucair.certification.proyectoentrega.tasks;

import co.com.choucair.certification.proyectoentrega.model.User;
import co.com.choucair.certification.proyectoentrega.userinterface.FillPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class Fill implements Task {

    private User user;

    public Fill(User user) {
        this.user = user;
    }

    public static Fill theForm(User user) {
        return Tasks.instrumented(Fill.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T actor)  {
        String dateOfBirth[]=user.getDateOfBirth().split("-");

        actor.attemptsTo(Enter.theValue(user.getFirstName()).into(FillPage.FIRST_NAME),
        Enter.theValue(user.getLastName()).into(FillPage.LAST_NAME),
        Enter.theValue(user.getEmail()).into(FillPage.EMAIL),
        Click.on(FillPage.SELECT_DATE_OF_BIRTH_DAY),
        SelectFromOptions.byVisibleText(dateOfBirth[0]).from(FillPage.SELECT_DATE_OF_BIRTH_MONTH),
        SelectFromOptions.byVisibleText(dateOfBirth[1]).from(FillPage.SELECT_DATE_OF_BIRTH_DAY),
        SelectFromOptions.byVisibleText(dateOfBirth[2]).from(FillPage.SELECT_DATE_OF_BIRTH_YEAR),
        Click.on(FillPage.BUTTON_NEXT_LOCATION),

        Clear.field(FillPage.CITY),
        Enter.keyValues(user.getCity()).into(FillPage.CITY),
        Click.on(FillPage.CITY_SELECTED),
        Enter.theValue(user.getPostalCode()).into(FillPage.POSTAL_CODE),
        Click.on(FillPage.BUTTON_NEXT_DEVICES),


        Click.on(FillPage.BUTTON_LAST_STEP),


        Enter.theValue(user.getPassword()).into(FillPage.PASSWORD),
        Enter.theValue(user.getConfirmPassword()).into(FillPage.CONFIRM_PASSWORD),


        Click.on(FillPage.ACCEPT_TERMS),
        Click.on(FillPage.ACCEPT_PRIVACY),
        Click.on(FillPage.BUTTON_COMPLETE_SETUP)
        );

    }
}
