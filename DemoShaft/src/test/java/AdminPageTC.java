import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AdminPageTC extends TestBase{

    private  AdminPage adminPage;
    private LoginPage loginPage;


    @Test
    public void Admin() throws InterruptedException {

        JsonDataReader jsonDataReader = new JsonDataReader("C:\\Users\\Mahmoud\\IdeaProjects\\DemoShaft\\src\\test\\java\\Data.json");
        JsonDataReader jsonDataReader1 = new JsonDataReader("C:\\Users\\Mahmoud\\IdeaProjects\\DemoShaft\\src\\test\\java\\Data2.json");
        String UserName = jsonDataReader.getUsername();
        String Password = jsonDataReader.getPassword();
        String OperatingCountryCoder = jsonDataReader1.getOperatingCountryName();
        String SelectCountry = jsonDataReader1.getSelectCountry();
        String SelectCurrency = jsonDataReader1.getSelectCurrency();
        loginPage = new LoginPage(driver);
        adminPage = new AdminPage(driver);
        loginPage.login(UserName,Password);
        adminPage.setOperatingCountry(OperatingCountryCoder,SelectCountry,SelectCurrency);
        Thread.sleep(3000);
        String Expected = driver.getDriver().findElement(By.xpath("//*[@id=\"statusMsg\"]/font")).getText();
        String Actual = "Unable to create Operating Country, Please try later.";
        Assert.assertEquals(Actual,Expected);

    }
}
