package ADMIN.STAFF;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Staff {

    public static final int MILLIS = 3000;

    public Staff(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    SHAFT.GUI.WebDriver driver ;
    By Admin = By.xpath("//a[@href=\"/admin\"]");
    By Staff = By.xpath("//a[@href=\"/admin/staff\"]");
    By StaffName = By.xpath("//input[@id=\"id-StaffName\"]");
    By UserName = By.xpath("//input[@id=\"id-UserName\"]");
    By Branch = By.xpath("//p-multiselect[@class=\"p-element p-inputwrapper fg-input ng-untouched ng-pristine" +
            " ng-invalid ng-star-inserted\"]");
    //By Branch = By.partialLinkText("Select Branch");
    By SearchBranch = By.xpath("//input[@role=\"textbox\"]");
    By ExitBranch = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-staff/div/ndc-fg-form-container" +
            "/div/ndc-fg-form-generator/form/ndc-fg-input[3]/ndc-fg-dropdown-input/p-multiselect/div/p-overlay/div/div/" +
            "div/div[1]/button/span");
    By Department = By.xpath("//p-multiselect[@class=\"p-element p-inputwrapper fg-input ng-untouched ng-pristine " +
            "ng-valid ng-star-inserted\"]");

    By SearchDepartment = By.xpath("//input[@role=\"textbox\"]");
    By ExitDepartment = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-staff/div/ndc-fg-form-" +
            "container/div/ndc-fg-form-generator/form/ndc-fg-input[4]/ndc-fg-dropdown-input/p-multiselect/div/p-overlay/" +
            "div/div/div/div[1]/button/span");
    By Designation = By.xpath("//span[@class=\"p-dropdown-label p-inputtext p-placeholder ng-star-inserted\"]");
    By SearchBtn = By.xpath("//span[@class=\"p-button-label\"]");



    public void Clickonadmin() throws InterruptedException {

        driver.element().click(Admin);
        Thread.sleep(3000);

    }

    public void ClickonStuff() throws InterruptedException {
        driver.element().click(Staff);
        Thread.sleep(3000);
    }


    public void fill( String s , String u  , String s1  , String s2 , String d1) throws InterruptedException {

    driver.element().type(StaffName,s);
    Thread.sleep(MILLIS);
    driver.element().type(UserName,u);
    Thread.sleep(3000);
    driver.element().click(Branch);
    Thread.sleep(3000);
    driver.element().select(SearchBranch,s1);
    Thread.sleep(3000);
    driver.element().click(ExitBranch);
    Thread.sleep(3000);
    driver.element().click(Department);
    Thread.sleep(3000);
    driver.element().select(SearchDepartment,s2);
    Thread.sleep(3000);
    driver.element().click(ExitDepartment);
    Thread.sleep(3000);
    driver.element().select(Designation,d1);
    Thread.sleep(3000);
    driver.element().click(SearchBtn);


    }
}
