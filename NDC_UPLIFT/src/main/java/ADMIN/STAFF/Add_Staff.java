package ADMIN.STAFF;
import com.shaft.driver.SHAFT;
import io.cucumber.java.hu.De;
import org.openqa.selenium.By;

public class Add_Staff {

    public static final int MILLIS = 1000;

    public Add_Staff (SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    SHAFT.GUI.WebDriver driver ;
    By AddStuff = By.xpath("//span[@style=\"margin-inline-end: 10px;\"]");
//    By Usertype = By.xpath("//input[@id=\"id-Usertype\"]");
    By Usertype = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-add-staff/div/div/ndc-fg-form" +
        "-container/div/ndc-fg-form-generator/form/div[1]/div/ndc-fg-input[1]/ndc-fg-dropdown-input/p-dropdown/div/span");

    By OperatingCountry = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-add-staff/div/div/" +
            "ndc-fg-form-container/div/ndc-fg-form-generator/form/div[1]/div/ndc-fg-input[2]/ndc-fg-dropdown-input/p-multiselect/div/div[2]");
    By SearchOperatingCountry = By.xpath("//input[@class=\"p-multiselect-filter p-inputtext p-component\"]");
    By ExitOperatingCountry = By.xpath("//span[@class=\"p-multiselect-close-icon pi pi-times\"]");
    By Branch = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-add-staff/div/div/ndc-fg-form" +
            "-container/div/ndc-fg-form-generator/form/div[1]/div/ndc-fg-input[3]/ndc-fg-dropdown-input/p-multiselect/div/div[2]");
    By SearchBranch = By.xpath("//input[@class=\"p-multiselect-filter p-inputtext p-component\"]");
    By ExitBranch = By.xpath("//span[@class=\"p-multiselect-close-icon pi pi-times\"]");
    By Department = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-add-staff/div/div/" +
            "ndc-fg-form-container/div/ndc-fg-form-generator/form/div[1]/div/ndc-fg-input[4]/ndc-fg-dropdown-input/p-multiselect/div/div[2]");
    By SearchDepartment = By.xpath("//input[@class=\"p-multiselect-filter p-inputtext p-component\"]");
    By ExitDepartment = By.xpath("//span[@class=\"p-multiselect-close-icon pi pi-times\"]");
    By Designation = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-add-staff/div/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div[1]/div/ndc-fg-input[5]/ndc-fg-dropdown-input/p-dropdown/div/span");
    By Role = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-add-staff/div/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div[1]/div/ndc-fg-input[6]/ndc-fg-dropdown-input/p-multiselect/div/div[2]");
    By SearchRole = By.xpath("//input[@class=\"p-multiselect-filter p-inputtext p-component\"]");
    By ExitRole = By.xpath("//span[@class=\"p-multiselect-close-icon pi pi-times\"]");
    By EmployeeName = By.xpath("//input[@id=\"id-Employeename\"]");
    By EmployeeEmail = By.xpath("//input[@id=\"id-Employeeemail\"]");
    By EmployeePhoneNo = By.xpath("//input[@id=\"id-Employeephonenumber\"]");
    By EmployeeSecondaryNo = By.xpath("//input[@id=\"id-Secondaryphonenumber\"]");
    By UserName = By.xpath("//input[@id=\"id-Username\"]");
    By AgencyCode = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-add-staff/div/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div[2]/div/ndc-fg-input[6]/ndc-fg-dropdown-input/p-dropdown/div/span");
    By ImportPNROption = By.xpath("//div[@class=\"p-checkbox-box\"]");
    By YesUndercut = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-add-staff/div/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div[2]/div/ndc-fg-input[8]/ndc-fg-radio-input/div/p-radiobutton[1]/div/div[2]");
    By NoUndercut = By.xpath("//input[@id=\"id-Optiontoundercut-No\"]");
    By SendforApproval = By.xpath("//button[@type=\"submit\"]");

    public void addstuff() throws InterruptedException {
        driver.element().click(AddStuff);
        Thread.sleep(MILLIS);
    }

    public void setAddStuff(String usertype ,String searchoperatingcountry,String searchbranch , String searchdepartment
    , String designation,String searchrole,String employeename,String employeeemail,String employeephoneno,String
                                    employeesecno,String username,String agencycode ) throws InterruptedException {

      Thread.sleep(MILLIS);
      driver.element().select(Usertype,usertype);
      Thread.sleep(MILLIS);
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
      driver.element().select(Designation,designation);
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
