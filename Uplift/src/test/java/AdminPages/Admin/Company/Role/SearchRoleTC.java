package AdminPages.Admin.Company.Role;

import AdminPages.Admin.Staff.SearchStaff;
import AdminPages.Admin.Staff.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SearchRoleTC extends TestBase {
    private SearchStaff staff;
    private SearchRole searchRole;

    @Test
    public void setSearchRoleActive() throws InterruptedException {
        staff = new SearchStaff(driver);
        searchRole = new SearchRole(driver);
        staff.Clickonadmin();
        searchRole.setRole("Amed");
        searchRole.setActive();
        searchRole.setSearchGrid();
    }

    @Test
    public void setSearchRoleInactive() throws InterruptedException {
        staff = new SearchStaff(driver);
        searchRole = new SearchRole(driver);
        staff.Clickonadmin();
        searchRole.setRole("Amed");
        searchRole.setInactive();
        searchRole.setSearchGrid();
    }


    @Test
    public void setSearchRoleBoth() throws InterruptedException {
        staff = new SearchStaff(driver);
        searchRole = new SearchRole(driver);
        staff.Clickonadmin();
        searchRole.setRole("Amed");
        searchRole.setBoth();
        searchRole.setSearchGrid();
    }

    @AfterMethod
    public void navigateBackToURL() {
        driver.browser().navigateToURL("http://192.168.1.94/master/flight/preferAirline/add");
    }
}