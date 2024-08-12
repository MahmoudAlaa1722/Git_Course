package AdminPages.Admin.Agency.AgencyRegistrationRequest;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class RegistrationRequest {

    public RegistrationRequest (SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    SHAFT.GUI.WebDriver driver ;

    By Agency = By.linkText("Agency");
    By RegistrationRequest = By.linkText("Registration requests");
    By AgencyName = By.xpath("//input[@id=\"id-Agencyname\"]");
    By ContactName = By.xpath("//input[@id=\"id-Contactname\"]");
    By Requestdate = By.xpath("//input[@id=\"id-Requestdate\"]");
    By CleanderClick = By.xpath("//span[@class=\"calender-icon\"]");
    By Email = By.xpath("//input[@id=\"id-email\"]");
    By New = By.xpath("//p-radiobutton[.//input[@id=\"id-Status-New\"]]");
    By inProgress = By.xpath("//p-radiobutton[.//input[@id=\"id-Status-Inprogress\"]]");
    By Rejected = By.xpath("//p-radiobutton[.//input[@id=\"id-Status-Rejected\"]]");
    By Searchgrid = By.xpath("//button[@type=\"submit\"]");

    public void setAgency(){
        driver.element().click(Agency);
    }

    public void setRegistrationRequest(String agencyname, String contactname, String email, String requestdate){
        driver.element().click(RegistrationRequest);
        driver.element().type(AgencyName,agencyname);
        driver.element().type(ContactName,contactname);
        driver.element().type(Requestdate,requestdate);
        driver.element().click(CleanderClick);
        //driver.element().click(Selectdate);
        driver.element().type(Email,email);
    }
    public void setNew(){
        driver.element().click(New);
    }

    public void setInProgress(){
        driver.element().click(inProgress);
    }

    public void setRejected(){
        driver.element().click(Rejected);
    }

    public void setSearchgrid(){
        driver.element().click(Searchgrid);
    }


}