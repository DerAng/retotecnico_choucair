package co.com.choucair.certification.proyectoentrega.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchMessagePage extends PageObject {

    public static final Target NAME_MESSAGE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//span[contains(text(),'The last step')]"));
}
