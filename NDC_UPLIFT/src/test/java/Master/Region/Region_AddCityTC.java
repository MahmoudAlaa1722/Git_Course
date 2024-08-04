package Master.Region;
import Data.Provider.JsonDataProvider;
import org.testng.annotations.Test;

public class Region_AddCityTC extends TestBase {
    private Region_SearchCity regionSearchCity;
    private Region_AddCity regionAddCity;


    @Test(dataProvider = "AddRegionCity",dataProviderClass = JsonDataProvider.class)
    public void addCity(String CountryName , String StateName , String StateCode ,String CityName ,String CityCode) throws InterruptedException {
    regionAddCity = new Region_AddCity(driver);
    regionSearchCity = new Region_SearchCity(driver);
    regionSearchCity.ClickonMaster();
    regionSearchCity.ClickonMiscellanous();
    regionSearchCity.ClickonRegion();
    regionSearchCity.ClickonCity();
    regionAddCity.AddcityDetails(CountryName,StateName,StateCode,CityName,CityCode);


    }
}
