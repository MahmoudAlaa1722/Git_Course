import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {
  SHAFT.GUI.WebDriver driver ;
  public LoginPage(SHAFT.GUI.WebDriver driver) {
    this.driver = driver;
  }


  By Username = By.xpath("//input[@id=\"userAlias\"]");
  By Password = By.xpath("//input[@id=\"password_password\"]");
  By LoginButton = By.xpath("//input[@id=\"login_id\"]");




  public void login(String u , String p) throws InterruptedException {

    driver.element().type( Username,u)
            .type( Password,p);
    Thread.sleep(2000);
    driver.element().click(LoginButton);
    Thread.sleep(3000);


  }
}
