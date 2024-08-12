package AdminPages.Admin.Staff;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class CreateStaff {

    public static final int MILLIS = 1000;

    public CreateStaff (SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    SHAFT.GUI.WebDriver driver ;

    By AddStuff = By.xpath("//span[@style=\"margin-inline-end: 10px;\"]");
    By Usertype = By.xpath("//p-dropdown[.//input[@id=\"id-Usertype\"]]");
    By OperatingCountry = By.xpath("//p-multiselect[.//input[@name='Operating country']]");
    By SearchOperatingCountry = By.xpath("//input[@class=\"p-multiselect-filter p-inputtext p-component\"]");
    By ExitOperatingCountry = By.xpath("//span[@class=\"p-multiselect-close-icon pi pi-times\"]");
    By Branch = By.xpath("//p-multiselect[.//input[@id=\"id-Branch\"]]");
    By SearchBranch = By.xpath("//input[@class=\"p-multiselect-filter p-inputtext p-component\"]");
    By ExitBranch = By.xpath("//span[@class=\"p-multiselect-close-icon pi pi-times\"]");
    By Department = By.xpath("//p-multiselect[.//input[@id=\"id-Department\"]]");
    By SearchDepartment = By.xpath("//input[@class=\"p-multiselect-filter p-inputtext p-component\"]");
    By ExitDepartment = By.xpath("//span[@class=\"p-multiselect-close-icon pi pi-times\"]");
    By Role = By.xpath("//p-multiselect[.//input[@id=\"id-Role\"]]");
    By SearchRole = By.xpath("//input[@class=\"p-multiselect-filter p-inputtext p-component\"]");
    By ExitRole = By.xpath("//span[@class=\"p-multiselect-close-icon pi pi-times\"]");
    By EmployeeName = By.xpath("//input[@id=\"id-Employeename\"]");
    By EmployeeEmail = By.xpath("//input[@id=\"id-Employeeemail\"]");
    By EmployeePhoneNo = By.xpath("//input[@id=\"id-Employeephonenumber\"]");
    By EmployeeSecondaryNo = By.xpath("//input[@id=\"id-Secondaryphonenumber\"]");
    By UserName = By.xpath("//input[@id=\"id-Username\"]");
    By AgencyCode = By.xpath("//p-dropdown[.//input[@id=\"id-Agencycode\"]]");
    By ImportPNROption = By.xpath("//div[@class=\"p-checkbox-box\"]");
    By YesUndercut = By.xpath("//p-radiobutton[.//input[@id=\"id-Optiontoundercut-Yes\"]]");
    By NoUndercut = By.xpath("//p-radiobutton[.//input[@id=\"id-Optiontoundercut-No\"]]");
    By SendforApproval = By.xpath("//button[@type=\"submit\"]");

    public void addstuff() throws InterruptedException {
        driver.element().click(AddStuff);
        Thread.sleep(MILLIS);
    }

    public void setAddStuff(String usertype ,String searchoperatingcountry,String searchbranch , String searchdepartment
             ,String searchrole,String employeename,String employeeemail,String employeephoneno,String
                                    employeesecno,String username,String agencycode ) throws InterruptedException {

        Thread.sleep(MILLIS);
        driver.element().select(Usertype,usertype);
        Thread.sleep(3000);
        //driver.getDriver().findElement(parentLocator).findElement(triggerLocator).click();
        //Thread.sleep(MILLIS);
        driver.element().click(OperatingCountry);
        Thread.sleep(MILLIS);
        driver.element().select(SearchOperatingCountry,searchoperatingcountry);
        Thread.sleep(MILLIS);
        driver.element().click(ExitOperatingCountry);
        Thread.sleep(MILLIS);
        driver.element().click(Branch);
        Thread.sleep(MILLIS);
        driver.element().select(SearchBranch,searchbranch);
        Thread.sleep(MILLIS);
        driver.element().click(ExitBranch);
        Thread.sleep(MILLIS);
        driver.element().click(Department);
        Thread.sleep(MILLIS);
        driver.element().select(SearchDepartment,searchdepartment);
        Thread.sleep(MILLIS);
        driver.element().click(ExitDepartment);
        Thread.sleep(MILLIS);
        driver.element().click(Role);
        Thread.sleep(MILLIS);
        driver.element().select(SearchRole,searchrole);
        Thread.sleep(MILLIS);
        driver.element().click(ExitRole);
        Thread.sleep(MILLIS);
        driver.element().type(EmployeeName,employeename);
        Thread.sleep(MILLIS);
        driver.element().type(EmployeeEmail,employeeemail);
        Thread.sleep(MILLIS);
        driver.element().type(EmployeePhoneNo,employeephoneno);
        Thread.sleep(MILLIS);
        driver.element().type(EmployeeSecondaryNo,employeesecno);
        Thread.sleep(MILLIS);
        driver.element().type(UserName,username);
        Thread.sleep(MILLIS);
        driver.element().select(AgencyCode,agencycode);
        Thread.sleep(MILLIS);
        driver.element().click(ImportPNROption);
    }

    public void setYesUndercut(){
        driver.element().click(YesUndercut);
        driver.element().click(SendforApproval);
    }

    public void setNoUndercut(){
        driver.element().click(NoUndercut);
        driver.element().click(SendforApproval);
    }



}
