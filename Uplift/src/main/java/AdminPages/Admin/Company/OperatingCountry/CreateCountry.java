package AdminPages.Admin.Company.OperatingCountry;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class CreateCountry {
    public CreateCountry (SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    SHAFT.GUI.WebDriver driver ;
    By AddCountry = By.xpath("//button[@routerlink=\"add\"]");
    By OperatingCountryName = By.xpath("//input[@id=\"id-OperatingCountryName\"]");
    By SelectCountry = By.xpath("//p-dropdown[.//input[@id=\"id-Country\"]]");
    By SelectCurrency = By.xpath("//p-dropdown[.//input[@id=\"id-Currency\"]]");
    By SendForApproval = By.xpath("//button[@type=\"submit\"]");

    public void setAddCountry(String opcountryname , String selectcountry , String selectcurrency) throws InterruptedException {
        driver.element().click(AddCountry);
        Thread.sleep(1000);
        driver.element().type(OperatingCountryName,opcountryname);
        //Thread.sleep(1000);
        //  driver.element().select(SelectCountry,selectcountry);
        Thread.sleep(1000);
        driver.element().select(SelectCurrency,selectcurrency);
        Thread.sleep(1000);
        driver.element().click(SendForApproval);
    }
}