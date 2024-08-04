package ADMIN.STAFF.TC;

import ADMIN.STAFF.Staff;
import Data.Provider.JsonDataProvider;
import org.testng.annotations.Test;

public class StaffTC extends TestBase {
  private Staff staff;

  @Test(dataProvider = "SearchStaffData",dataProviderClass = JsonDataProvider.class )
    public void teststaff(String StaffName,String UserName , String Branch ,String Department , String Designation) throws InterruptedException {
    staff = new Staff(driver);
    staff.Clickonadmin();
    staff.ClickonStuff();
    staff.fill(StaffName,UserName,Branch,Department,Designation);

  }
}
