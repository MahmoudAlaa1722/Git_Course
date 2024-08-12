package AdminPages.Admin.Staff;
import AdminPages.DataProvider.JsonDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Map;

public class SearchStaffTC extends TestBase {
    private SearchStaff staff;

    @Test(dataProvider = "SearchStaffData",dataProviderClass = JsonDataProvider.class)
    public void teststaff(Map<String,String> st) throws InterruptedException {
        staff = new SearchStaff(driver);
        staff.Clickonadmin();
        staff.ClickonStuff();
        String StaffName = st.get("StaffName");
        String UserName = st.get("UserName");
        String Branch = st.get("Branch");
        String Department = st.get("Department");
        String Designation = st.get("Designation");

        staff.fill(StaffName,UserName,Branch,Department,Designation);

    }

    @AfterMethod
    public void navigateBackToURL() {
        driver.browser().navigateToURL("http://192.168.1.94/master/flight/preferAirline/add");
    }
}