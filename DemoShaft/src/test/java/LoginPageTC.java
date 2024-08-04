import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTC extends TestBase{

   private LoginPage loginPage;


   @Test(dataProvider = "LoginData", dataProviderClass = JsonDataProvider.class)
   public void ValidLogin(String username , String password) throws InterruptedException {
      //JsonDataReader jsonDataReader = new JsonDataReader("C:\\Users\\Mahmoud\\IdeaProjects\\DemoShaft\\src\\test\\java\\Data.json");
      //String Username = jsonDataReader.getUsername();
      //String Password = jsonDataReader.getPassword();

      loginPage = new LoginPage(driver);
      loginPage.login(username,password);
      Thread.sleep(3000);

      //String Expected = driver.getDriver().findElement(By.xpath("//p[@class=\"welcome_txt\"]")).getText();
      // String Actual = "Welcome";
      // Assert.assertEquals(Actual,Expected);
      // String Expected1 = driver.getDriver().findElement(By.xpath("//*[@id=\"formId\"]/ul/li[2]/div[7]/span")).getText();
      // String Actual1 = "Invalid credentials, Please try again.";
      // Perform the assertions based on the conditions
      // Fetch the text elements
      //String welcomeText = driver.getDriver().findElement(By.xpath("//p[@class=\"welcome_txt\"]")).getText();
      //String errorText = driver.getDriver().findElement(By.xpath("//*[@id=\"formId\"]/ul/li[2]/div[7]/span")).getText();

      String expectedWelcome = "Welcomee";
      String expectedError = "Invalid credentials, Please try again.";
      Thread.sleep(3000);
      try {
         String welcomeText = driver.getDriver().findElement(By.xpath("//p[@class=\"welcome_txt\"]")).getText();
         Assert.assertEquals(expectedWelcome, welcomeText);
      } catch (Exception e) {
         try {
            String errorText = driver.getDriver().findElement(By.xpath("//*[@id=\"formId\"]/ul/li[2]/div[7]/span")).getText();
            Assert.assertEquals(expectedError, errorText);
         } catch (Exception ex) {
            Assert.fail("Neither welcome message nor error message matched the expected values.");
         }
      }

   }




}
