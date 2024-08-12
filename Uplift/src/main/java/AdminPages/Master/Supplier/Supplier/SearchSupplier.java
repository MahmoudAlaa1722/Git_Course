package AdminPages.Master.Supplier.Supplier;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class SearchSupplier {
    public static final int MILLIS = 3000;

    public SearchSupplier(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    SHAFT.GUI.WebDriver driver ;
    By Supplier = By.linkText("Supplier");
    By Supplier1 = By.xpath("//a[@href=\"/master/supplier/supplier\"]");
    By SupplierName = By.xpath("id=\"id-SupplierName\"");
    By SupplierType = By.xpath("//span[@class=\"p-dropdown-label p-inputtext p-placeholder ng-star-inserted\"]");
    By SearchGrid = By.xpath("//span[@class=\"p-button-label\"]");

    public void clickonsupplier(){
        driver.element().click(Supplier);
    }

    public void searchsupplierdata(String suppliername,String suppliertype ){
        driver.element().click(Supplier1);
        driver.element().type(SupplierName,suppliername);
        driver.element().select(SupplierType,suppliertype);
        driver.element().click(SearchGrid);

    }
}
