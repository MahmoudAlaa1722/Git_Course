package ADMIN.STAFF.TC;
import ADMIN.STAFF.Add_Staff;
import ADMIN.STAFF.Staff;
import Data.Provider.JsonDataProvider;
import org.testng.annotations.Test;

public class Add_StaffTC extends TestBase{
    private Staff staff;
    private Add_Staff addStaff;

    @Test(dataProvider = "CreateStaffData",dataProviderClass = JsonDataProvider.class)
    public void Create_Stuff(String Usertype , String SearchOperatingCountry,String SearchBranch , String SearchDepartment
    ,String Designation , String SearchRole , String EmployeeName , String EmployeeEmail ,String EmployeePhoneNo ,
                             String EmployeeSecondaryNo , String UserName , String AgencyCode) throws InterruptedException {
     staff = new Staff(driver);
     addStaff = new Add_Staff(driver);
     staff.Clickonadmin();
     addStaff.addstuff();
     addStaff.setAddStuff(Usertype,SearchOperatingCountry,SearchBranch,SearchDepartment,Designation,SearchRole
     ,EmployeeName,EmployeeEmail,EmployeePhoneNo,EmployeeSecondaryNo,UserName,AgencyCode);
     addStaff.setYesUndercut();

    }
}
