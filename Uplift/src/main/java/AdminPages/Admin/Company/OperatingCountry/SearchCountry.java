package AdminPages.Admin.Company.OperatingCountry;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class SearchCountry {

    public SearchCountry(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    SHAFT.GUI.WebDriver driver ;
    By Company = By.linkText("Company");
    // By OperatingCountry = By.xpath("//a[@href=\"/admin/operating-country\"]");
    By OperatingCountryName = By.xpath("//input[@id=\"id-Operatingcountryname\"]");
    //  By SelectCountry = By.xpath("//p-dropdown[.//input[@id=\"id-SelectCountry\"]]");
    By Inactive = By.xpath("//p-radiobutton[.//input[@id=\"id-Status-Inactive\"]]");
    By Active = By.xpath("//p-radiobutton[.//input[@id=\"id-Status-Active\"]]");
    By Both = By.xpath("//p-radiobutton[.//input[@id=\"id-Status-Both\"]]");
    By SearchGrid = By.xpath("//button[@type=\"submit\"]");

    public void setOperatingCountry(String operatingcountryname,String selectcountry) throws InterruptedException {
        // driver.element().click(Company);
        // Thread.sleep(1000);
        // driver.element().click(OperatingCountry);
        //Thread.sleep(1000);
        driver.element().type(OperatingCountryName,operatingcountryname);
        Thread.sleep(1000);
        // driver.element().select(SelectCountry,selectcountry);
        //  Thread.sleep(1000);


    }

    public void setInactive() throws InterruptedException {
        driver.element().click(Inactive);
        Thread.sleep(1000);
    }

    public void setActive() throws InterruptedException {

        driver.element().click(Active);
        Thread.sleep(1000);
    }

    public void setBoth() throws InterruptedException {

        driver.element().click(Both);
        Thread.sleep(1000);
    }

    public void setSearchGrid(){
        driver.element().click(SearchGrid);
    }
}
