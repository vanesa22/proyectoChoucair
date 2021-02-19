package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_enter = Target.the("Da click en el curso").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/aside/section[3]/div/div/div[1]/div/div/div[2]/div[2]/div/div/div/div/a"));
    //*[@id="favorite-icon-1279-8"]
    public static final Target BUTTON_UC = Target.the("Selecciona la Universidad Choucair").located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the("Busca el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar").located(By.id("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso").located(By.xpath("//h5[contains(text(),'Prueba Técnica - Analista Bancolombia']"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/aside/section[3]/div/div/div[1]/div/div/div[2]/div[2]/div/div/div/div/a/span[3]")); ;

/*
 public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("//div[@class='d-inline h5']"));
 public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("//div[@class='d-inline h5']"));
 public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").located(By.xpath("//div[@class='d-inline h5']"));
 public static final Target ENTER_BUTTON = Target.the("button to confirm ").located(By.xpath("//*[@id=\"recentlyaccessedcourses-view-602d9a94cecdd602d9a949d2004\"]/div[2]/div[2]/div/a/div"));
 public static final Target Curso = Target.the("where do we write the password").located(By.xpath("//*[@id=\"page-container-2\"]/div/div/div/div/div/div[2]/a/h6"));
 */
}
