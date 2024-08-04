package Master.Region;

import ADMIN.STAFF.TC.TestBase;
import Data.Provider.JsonDataProvider;
import org.testng.annotations.Test;

public class Region_SearchCityTC extends TestBase {
    private Region_SearchCity regionSearchCity;

    @Test(dataProvider = "SearchRegionCity",dataProviderClass = JsonDataProvider.class)
    public void Regioncity(String StateName , String StateCode , String CountryName ,String CityName ,String CityCode ) throws InterruptedException {
    regionSearchCity = new Region_SearchCity(driver);
    regionSearchCity.ClickonMaster();
    regionSearchCity.ClickonMiscellanous();
    regionSearchCity.ClickonRegion();
    regionSearchCity.ClickonCity();
    regionSearchCity.SearchRegionCity(StateName,StateCode,CountryName,CityName,CityCode);
   // regionSearchCity.setActiveBtn();
    regionSearchCity.setInActiveBtn();
    }
}
