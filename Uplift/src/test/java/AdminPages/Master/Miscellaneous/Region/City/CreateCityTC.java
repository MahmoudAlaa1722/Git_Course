package AdminPages.Master.Miscellaneous.Region.City;

import AdminPages.Admin.Staff.TestBase;
import AdminPages.DataProvider.JsonDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Map;

public class CreateCityTC extends TestBase {
    private SearchCity regionSearchCity;
    private CreateCity regionAddCity;


    @Test(dataProvider = "AddRegionCity",dataProviderClass = JsonDataProvider.class)
    public void addCity(Map<String,String> city) throws InterruptedException {
        regionAddCity = new CreateCity(driver);
        regionSearchCity = new SearchCity(driver);
        regionSearchCity.ClickonMaster();
        regionSearchCity.ClickonMiscellanous();
        regionSearchCity.ClickonRegion();
        regionSearchCity.ClickonCity();
        String CountryName = city.get("CountryName");
        String StateName = city.get("StateName");
        String StateCode = city.get("StateCode");
        String CityName  = city.get("CityName");
        String CityCode = city.get("CityCode");
        regionAddCity.AddcityDetails(CountryName,StateName,StateCode,CityName,CityCode);


    }
    @AfterMethod
    public void navigateBackToURL() {
        driver.browser().navigateToURL("http://192.168.1.94/master/flight/preferAirline/add");
    }
}

