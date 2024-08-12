package AdminPages.Admin.Company.TopUpRequest;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class Advance_Credit_Topup_Request {
    public Advance_Credit_Topup_Request (SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    SHAFT.GUI.WebDriver driver ;
    By AgencyName = By.xpath("//input[@id=\"id-Agencyname\"]");
    By Status = By.xpath("//p-dropdown[.//input[@id=\"id-Status\"]]");
    By TopUpReferenceNumber = By.xpath("//input[@id=\"id-TopUpReferenceNumber\"]");
    By ReceiptNumber = By.xpath("//input[@id=\"id-ReceiptNumber\"]");
    By Date = By.xpath("//input[@id=\"id-Topupcreationdate\"]");
    By SelectDate = By.linkText("28");
    By PaymentMethod = By.xpath("//p-dropdown[.//input[@id=\"id-Paymentmode\"]]");
    By Reset = By.xpath("//button[@type=\"reset\"]");
    By SearchGrid = By.xpath("//button[@type=\"submit\"]");
}
