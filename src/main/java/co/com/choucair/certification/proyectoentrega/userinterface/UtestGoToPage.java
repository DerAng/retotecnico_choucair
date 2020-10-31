package co.com.choucair.certification.proyectoentrega.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestGoToPage extends PageObject {

    public static final Target JOIN_TODAY = Target.the("button that allows us to go to the registration form")
            .located(By.xpath("//a[contains(@class, 'unauthenticated-nav-bar__sign-up') and contains(text(),'Join Today')]"));

}
