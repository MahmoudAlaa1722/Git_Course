import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class AdminPage {
    public AdminPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    SHAFT.GUI.WebDriver driver ;

    By Admin = By.xpath("//a[@href=\"/odeysysadmin/Admin/searchOperatingCountry\"]");
    By AddBtn = By.xpath("//a[@id=\"airport_add\"]");
    By OperatingCountryName = By.xpath("//input[@id=\"groupName\"]");
    By SelectCountry = By.xpath("//select[@id=\"orgModal.country\"]");
    By SelectCurrency = By.xpath("//select[@id=\"orgModal.currencyId\"]");
    By Approval = By.xpath("//input[@type=\"submit\"]");

    public void setOperatingCountry(String o , String c , String c1){
        driver.element().click(Admin)
                .click(AddBtn);
        driver.element().type(OperatingCountryName,o)
                .select(SelectCountry,c)
                .select(SelectCurrency,c1)
                .click(Approval);

    }

}
