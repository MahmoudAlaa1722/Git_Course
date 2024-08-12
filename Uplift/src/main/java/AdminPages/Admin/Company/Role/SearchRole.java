package AdminPages.Admin.Company.Role;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class SearchRole {
    public SearchRole (SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    SHAFT.GUI.WebDriver driver ;
    By Company = By.linkText("Company");
    By Role = By.linkText("Role");
    By RoleName = By.xpath("//input[@id=\"id-Rolename\"]");
    By Inactive = By.xpath("//p-radiobutton[.//input[@id=\"id-Status-Inactive\"]]");
    By Active = By.xpath("//p-radiobutton[.//input[@id=\"id-Status-Active\"]]");
    By Both = By.xpath("//p-radiobutton[.//input[@id=\"id-Status-Both\"]]");
    By SearchGrid = By.xpath("//button[@type=\"submit\"]");

    public void setRole(String rolename) throws InterruptedException {
        driver.element().click(Company);
        Thread.sleep(1000);
        driver.element().click(Role);
        Thread.sleep(1000);
        driver.element().type(RoleName,rolename);
    }

    public void setInactive(){
        driver.element().click(Inactive);
    }
    public void setActive(){
        driver.element().click(Active);
    }
    public void setBoth(){
        driver.element().click(Both);
    }
    public void setSearchGrid(){
        driver.element().click(SearchGrid);
    }
}
