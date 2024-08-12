package AdminPages.Admin.Staff;

import AdminPages.DataProvider.JsonDataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.Map;

public class CreateStaffTC extends TestBase{
    private SearchStaff staff;
    private CreateStaff addStaff;

    @Test(dataProvider = "CreateStaffData",dataProviderClass = JsonDataProvider.class)
    public void Create_Stuff(Map<String,String> st) throws InterruptedException {
        staff = new SearchStaff(driver);
        addStaff = new CreateStaff(driver);
        staff.Clickonadmin();
        staff.ClickonStuff();
        addStaff.addstuff();
        String Usertype =st.get("Usertype");
        String SearchOperatingCountry=st.get("SearchOperatingCountry");
        String SearchBranch = st.get("SearchBranch");
        String SearchDepartment =st.get("SearchDepartment");

        String SearchRole = st.get("SearchRole");
        String EmployeeName = st.get("EmployeeName");
        String EmployeeEmail = st.get("EmployeeEmail");
        String EmployeePhoneNo = st.get("EmployeePhoneNo");
        String EmployeeSecondaryNo = st.get("EmployeeSecondaryNo");
        String UserName = st.get("UserName");
        String AgencyCode = st.get("AgencyCode");
        addStaff.setAddStuff(Usertype,SearchOperatingCountry,SearchBranch,SearchDepartment,SearchRole
                ,EmployeeName,EmployeeEmail,EmployeePhoneNo,EmployeeSecondaryNo,UserName,AgencyCode);
        addStaff.setYesUndercut();

    }

    @AfterMethod
    public void navigateBackToURL() {
        driver.browser().navigateToURL("http://192.168.1.94/master/flight/preferAirline/add");
    }



}