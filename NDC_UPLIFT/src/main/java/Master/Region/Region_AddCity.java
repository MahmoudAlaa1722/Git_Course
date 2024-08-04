package Master.Region;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.python.antlr.ast.Str;

public class Region_AddCity {

    public static final int MILLIS = 1000;

    public Region_AddCity(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    SHAFT.GUI.WebDriver driver ;

    By AddCity = By.xpath("//button[@routerlink=\"add\"]");
    By CountryName = By.xpath("//input[@id=\"id-CountryName\"]");
    By StateName = By.xpath("//input[@id=\"id-StateName\"]");
    By StateCode = By.xpath("//input[@id=\"id-StateCode\"]");
    By CityName = By.xpath("//*[@id=\"id-Cityname\"]");
    By CityCode = By.xpath("//*[@id=\"id-CityCode\"]");
    By SendApproval = By.xpath("//button[@type=\"submit\"]");

    public void AddcityDetails(String countryname ,String statename,String statecode,String cityname,String citycode) throws InterruptedException {
        driver.element().click(AddCity);
        Thread.sleep(MILLIS);
        driver.element().type(CountryName,countryname);
        Thread.sleep(MILLIS);
        driver.element().type(StateName,statename);
        Thread.sleep(MILLIS);
        driver.element().type(StateCode,statecode);
        Thread.sleep(MILLIS);
        driver.element().type(CityName,cityname);
        Thread.sleep(MILLIS);
        driver.element().type(CityCode,citycode);
        Thread.sleep(MILLIS);
        driver.element().click(SendApproval);
        Thread.sleep(MILLIS);
    }

}
