package AdminPages.Admin.Agency.AgencyRegistrationRequest;
import AdminPages.Admin.Staff.SearchStaff;
import AdminPages.Admin.Staff.TestBase;
import AdminPages.DataProvider.JsonDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Map;

public class RegistrationRequestTC extends TestBase {
    private SearchStaff staff;
    private RegistrationRequest registrationRequests;

    @Test(dataProvider = "Registraton_requestdata",dataProviderClass = JsonDataProvider.class)
    public void setRequestsNew(Map<String,String>req) throws InterruptedException {
        staff = new SearchStaff(driver);
        registrationRequests = new RegistrationRequest(driver);
        String Agencyname = req.get("Agencyname");
        String Contactname = req.get("Contactname");
        String RequestDate = req.get("RequestDate");
        String Email = req.get("Email");
        staff.Clickonadmin();
        registrationRequests.setAgency();
        registrationRequests.setRegistrationRequest(Agencyname,Contactname,Email,RequestDate);
        registrationRequests.setNew();
        registrationRequests.setSearchgrid();

    }
    @Test(dataProvider = "Registraton_requestdata",dataProviderClass = JsonDataProvider.class)
    public void setRequestsInprogress(Map<String,String>req) throws InterruptedException {
        staff = new SearchStaff(driver);
        registrationRequests = new RegistrationRequest(driver);
        String Agencyname = req.get("Agencyname");
        String Contactname = req.get("Contactname");
        String RequestDate = req.get("RequestDate");
        String Email = req.get("Email");
        staff.Clickonadmin();
        registrationRequests.setAgency();
        registrationRequests.setRegistrationRequest(Agencyname,Contactname,Email,RequestDate);
        registrationRequests.setInProgress();
        registrationRequests.setSearchgrid();

    }
    @Test(dataProvider = "Registraton_requestdata",dataProviderClass = JsonDataProvider.class)
    public void setRequestsRejected(Map<String,String>req) throws InterruptedException {
        staff = new SearchStaff(driver);
        registrationRequests = new RegistrationRequest(driver);
        String Agencyname = req.get("Agencyname");
        String Contactname = req.get("Contactname");
        String RequestDate = req.get("RequestDate");
        String Email = req.get("Email");
        staff.Clickonadmin();
        registrationRequests.setAgency();
        registrationRequests.setRegistrationRequest(Agencyname,Contactname,Email,RequestDate);
        registrationRequests.setRejected();
        registrationRequests.setSearchgrid();

    }

    @AfterMethod
    public void navigateBackToURL() {
        driver.browser().navigateToURL("http://192.168.1.94/master/flight/preferAirline/add");
    }
}
