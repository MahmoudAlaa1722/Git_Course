package Master.Region;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

    protected SHAFT.GUI.WebDriver driver ;

    @BeforeTest
    public void setupBrowse() throws InterruptedException {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("http://192.168.1.94/master/flight/preferAirline/add");
        Thread.sleep(5000);
    }

    @AfterTest
    public void Quit(){
        driver.quit();
    }
}