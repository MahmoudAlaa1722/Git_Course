package AdminPages.Admin.Company.Department;
import AdminPages.Admin.Staff.SearchStaff;
import AdminPages.Admin.Staff.TestBase;
import AdminPages.DataProvider.JsonDataProvider;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.util.Map;

public class CreateDepartmentTC extends TestBase {
    private SearchStaff staff;
    private CreateDepartment addDepartment;

    @Test(dataProvider = "AddDepartment", dataProviderClass = JsonDataProvider.class)
    public void setAddDepartment(Map<String, String> department) throws InterruptedException {
        addDepartment = new CreateDepartment(driver);
        staff = new SearchStaff(driver);
        staff.Clickonadmin();

        String DepartmentName = department.get("DepartmentName");
        String AssignedQueue = department.get("AssignedQueue");

        addDepartment.setCompany();
        addDepartment.setDepartment();
        addDepartment.setAddDepartment(DepartmentName, AssignedQueue);
        addDepartment.setSendApprroval();

        String expectedWelcome = "Welcome";
        String expectedError = "required validation error";
        Thread.sleep(3000);
        try {
            String welcomeText = driver.getDriver().findElement(By.xpath("//p[@class=\"welcome_txt\"]")).getText();
            Assert.assertEquals(welcomeText, expectedWelcome);
        } catch (Exception e) {
            try {
                String errorText = driver.getDriver().findElement(By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-add-department/div/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/ndc-fg-input[1]/span")).getText();
                Assert.assertEquals(errorText, expectedError);
            } catch (Exception ex) {
                Assert.fail("Neither welcome message nor error message matched the expected values.");
            }
        }
    }



    @AfterMethod
    public void navigateBackToURL() {
        driver.browser().navigateToURL("http://192.168.1.94/master/flight/preferAirline/add");
    }
}
