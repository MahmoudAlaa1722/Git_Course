package AdminPages.Admin.Company.OperatingCountry;

import AdminPages.Admin.Staff.SearchStaff;
import AdminPages.Admin.Staff.TestBase;
import AdminPages.DataProvider.JsonDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Map;

public class SearchCountryTC extends TestBase {
   private SearchStaff  staff;
   private SearchCountry searchCompany;

    @Test(dataProvider = "OpCountrySearch" , dataProviderClass = JsonDataProvider.class)
    public void setSearchCompanyBoth(Map<String,String>OP) throws InterruptedException {
        staff = new SearchStaff(driver);
        searchCompany = new SearchCountry(driver);
        staff.Clickonadmin();
        String OperatingCountryName =OP.get("OperatingCountryName");
        String SelectCountry = OP.get("SelectCountry");
        searchCompany.setOperatingCountry(OperatingCountryName, SelectCountry);
        searchCompany.setBoth();
        searchCompany.setSearchGrid();

    }

    @Test(dataProvider = "OpCountrySearch" , dataProviderClass = JsonDataProvider.class)
    public void setSearchCompanyActive(Map<String,String>OP) throws InterruptedException {
        staff = new SearchStaff(driver);
        searchCompany = new SearchCountry(driver);
        staff.Clickonadmin();
        String OperatingCountryName =OP.get("OperatingCountryName");
        String SelectCountry = OP.get("SelectCountry");
        searchCompany.setOperatingCountry(OperatingCountryName, SelectCountry);
        searchCompany.setActive();
        searchCompany.setSearchGrid();

    }

    @Test(dataProvider = "OpCountrySearch" , dataProviderClass = JsonDataProvider.class)
    public void setSearchCompanyInactive(Map<String,String>OP) throws InterruptedException {
        staff = new SearchStaff(driver);
        searchCompany = new SearchCountry(driver);
        staff.Clickonadmin();
        String OperatingCountryName =OP.get("OperatingCountryName");
        String SelectCountry = OP.get("SelectCountry");
        searchCompany.setOperatingCountry(OperatingCountryName, SelectCountry);
        searchCompany.setInactive();
        searchCompany.setSearchGrid();

    }
    @AfterMethod
    public void navigateBackToURL() {
        driver.browser().navigateToURL("http://192.168.1.94/master/flight/preferAirline/add");
    }



}