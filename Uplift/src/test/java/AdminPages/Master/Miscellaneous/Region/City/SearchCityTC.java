package AdminPages.Master.Miscellaneous.Region.City;

import AdminPages.Admin.Staff.TestBase;
import AdminPages.DataProvider.JsonDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Map;

public class SearchCityTC extends TestBase {
    private SearchCity regionSearchCity;

    @Test(dataProvider = "SearchRegionCity",dataProviderClass = JsonDataProvider.class)
    public void RegioncityInactive(Map<String, String> city) throws InterruptedException {
        regionSearchCity = new SearchCity(driver);
        regionSearchCity.ClickonMaster();
        regionSearchCity.ClickonMiscellanous();
        regionSearchCity.ClickonRegion();
        regionSearchCity.ClickonCity();
        String StateName = city.get("StateName");
        String StateCode = city.get("StateCode");
        String CountryName = city.get("CountryName");
        String CityName = city.get("CityName");
        String CityCode = city.get("CityCode");
        regionSearchCity.SearchRegionCity(StateName,StateCode,CountryName,CityName,CityCode);
        // regionSearchCity.setActiveBtn();
        regionSearchCity.setInActiveBtn();
    }
    @Test(dataProvider = "SearchRegionCity",dataProviderClass = JsonDataProvider.class)
    public void RegioncityActive(Map<String, String> city) throws InterruptedException {
        regionSearchCity = new SearchCity(driver);
        regionSearchCity.ClickonMaster();
        regionSearchCity.ClickonMiscellanous();
        regionSearchCity.ClickonRegion();
        regionSearchCity.ClickonCity();
        String StateName = city.get("StateName");
        String StateCode = city.get("StateCode");
        String CountryName = city.get("CountryName");
        String CityName = city.get("CityName");
        String CityCode = city.get("CityCode");
        regionSearchCity.SearchRegionCity(StateName,StateCode,CountryName,CityName,CityCode);
        regionSearchCity.setActiveBtn();

    }
    @Test(dataProvider = "SearchRegionCity",dataProviderClass = JsonDataProvider.class)
    public void RegioncityBoth(Map<String, String> city) throws InterruptedException {
        regionSearchCity = new SearchCity(driver);
        regionSearchCity.ClickonMaster();
        regionSearchCity.ClickonMiscellanous();
        regionSearchCity.ClickonRegion();
        regionSearchCity.ClickonCity();
        String StateName = city.get("StateName");
        String StateCode = city.get("StateCode");
        String CountryName = city.get("CountryName");
        String CityName = city.get("CityName");
        String CityCode = city.get("CityCode");
        regionSearchCity.SearchRegionCity(StateName,StateCode,CountryName,CityName,CityCode);
        regionSearchCity.setBoth();

    }
    @AfterMethod
    public void navigateBackToURL() {
        driver.browser().navigateToURL("http://192.168.1.94/master/flight/preferAirline/add");
    }
}