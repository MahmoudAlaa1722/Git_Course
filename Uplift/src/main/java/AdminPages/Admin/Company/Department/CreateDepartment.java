package AdminPages.Admin.Company.Department;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class CreateDepartment {
    public CreateDepartment (SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    SHAFT.GUI.WebDriver driver ;
    By Company = By.linkText("Company");
    By Department = By.xpath("//a[@href=\"/admin/department\"]");
    By AddDepartment = By.xpath("//button[@routerlink=\"add\"]");
    By DepartmentName = By.xpath("//input[@id=\"id-Department\"]");
    By AssignedQueue = By.xpath("//p-multiselect[.//input[@id=\"id-Assignedqueue\"]]");
    By SearchQueue = By.xpath("//input[@role=\"textbox\"]");
    By Exit = By.xpath("//button[@class=\"p-ripple p-element p-multiselect-close p-link ng-star-inserted\"]");
    By SendApprroval = By.xpath("/html/body/ndc-root/ndc-layout/div/div[2]/div/ndc-add-department/div/div/ndc-fg-form-container/div/ndc-fg-form-generator/form/div/div[2]/button");
    By Cancel = By.xpath("//button[@type=\"reset\"]");
    public void  setCompany(){
        driver.element().click(Company);
    }
    public void setDepartment(){
        driver.element().click(Department);
    }
    public void setAddDepartment(String departname , String searchqueue) throws InterruptedException {
        driver.element().click(AddDepartment);
        Thread.sleep(1000);
        driver.element().type(DepartmentName,departname);
        Thread.sleep(1000);
        driver.element().click(AssignedQueue);
        Thread.sleep(1000);
        driver.element().select(SearchQueue,searchqueue);
        Thread.sleep(1000);
        driver.element().click(Exit);
    }

    public void setSendApprroval(){
        driver.element().click(SendApprroval);

    }

    public void setCancel(){
        driver.element().click(Cancel);
    }
}