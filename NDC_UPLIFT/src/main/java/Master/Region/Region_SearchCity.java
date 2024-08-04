package Master.Region;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Region_SearchCity {
    public static final int MILLIS1 = 1000;
    public static final int MILLIS = 1000;
    public Region_SearchCity(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    SHAFT.GUI.WebDriver driver ;
    By Admin = By.xpath("//a[@href=\"/master\"]");
    By Miscellaneous = By.xpath("/html/body/ndc-root/ndc-layout/div/div[1]/tilde-side-menu/div/ul/li[3]/tilde-accordion/header/a");
    By Region = By.xpath("//a[@href=\"/master/miscellaneous/region/region\"]");
    By City = By.xpath("//button[@routerlink=\"city\"]");
    By StateName = By.xpath("//input[@id=\"id-Statename\"]");
    By StateCode = By.xpath("//input[@id=\"id-StateCode\"]");
    By CountryName = By.xpath("//input[@id=\"id-Countryname\"]");
    By CityName = By.xpath("//input[@id=\"id-Cityname\"]");
    By CityCode = By.xpath("//input[@id=\"id-CityCode\"]");
    By InActiveBtn = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-region/div/ndc-region-" +
            "navigations-tabs/ndc-city/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/ndc-fg-input[6]/ndc-fg-" +
            "radio-input/div/p-radiobutton[1]/div/div[2]");
    By ActiveBtn = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-region/div/ndc-region-" +
            "navigations-tabs/ndc-city/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/ndc-fg-input[6]/ndc-fg-" +
            "radio-input/div/p-radiobutton[2]/div/div[2]");

    By Both = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-region/div/ndc-region-" +
            "navigations-tabs/ndc-city/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/ndc-fg-input[6]/ndc-fg-" +
            "radio-input/div/p-radiobutton[3]/div/div[2]");
    By SearchBtn = By.xpath("//button[@type=\"submit\"]");

    public void ClickonMaster(){
        driver.element().click(Admin);
    }
    public void ClickonMiscellanous(){
        driver.element().click(Miscellaneous);
    }
    public void ClickonRegion(){
        driver.element().click(Region);
    }
    public void ClickonCity() throws InterruptedException {
        driver.element().click(City);
        Thread.sleep(MILLIS1);
    }
    public void SearchRegionCity(String statename , String statecode,String countryname ,String cityname , String citycode) throws InterruptedException {

      driver.element().type(StateName,statename);
      Thread.sleep(MILLIS1);
      driver.element().type(StateCode,statecode);
      Thread.sleep(MILLIS1);
      driver.element().type(CountryName,countryname);
      Thread.sleep(MILLIS1);
      driver.element().type(CityName,cityname);
      Thread.sleep(MILLIS1);
      driver.element().type(CityCode,citycode);
    }

    public void setInActiveBtn() throws InterruptedException {
        driver.element().click(InActiveBtn);
        Thread.sleep(MILLIS1);
        driver.element().click(SearchBtn);
    }
    public void setActiveBtn() throws InterruptedException {
        driver.element().click(ActiveBtn);
        Thread.sleep(MILLIS1);
        driver.element().click(SearchBtn);
    }
    public void setBoth(){
        driver.element().click(Both);
        driver.element().click(SearchBtn);
    }
}
