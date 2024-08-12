package AdminPages.Admin.Company.OperatingCountry;

import AdminPages.Admin.Staff.SearchStaff;
import AdminPages.Admin.Staff.TestBase;
import AdminPages.DataProvider.JsonDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.util.Map;

public class CreateCountryTC extends TestBase {
    private SearchStaff staff;
    private CreateCountry addCountry;

    @Test(dataProvider = "AddopCountry",dataProviderClass = JsonDataProvider.class)
    public void setAddCountrydata(Map<String, String> OP) throws InterruptedException {
        staff = new SearchStaff(driver);
        addCountry = new CreateCountry(driver);
        staff.Clickonadmin();
        String OperatingCountryName = OP.get("OperatingCountryName");
        String Country = OP.get("Country");
        String Currency = OP.get("Currency");
        addCountry.setAddCountry(OperatingCountryName, Country, Currency);
    }

    @AfterMethod
    public void navigateBackToURL() {
        driver.browser().navigateToURL("http://192.168.1.94/master/flight/preferAirline/add");
    }
}