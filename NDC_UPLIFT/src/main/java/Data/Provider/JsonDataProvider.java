package Data.Provider;
import org.testng.annotations.DataProvider;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class JsonDataProvider {

    @DataProvider(name = "SearchStaffData")
    public Object[][] getData() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("C:\\Users\\Mahmoud\\IdeaProjects\\NDC_UPLIFT\\src\\test\\java\\Staff.json");
        Object obj = jsonParser.parse(reader);
        JSONArray userList = (JSONArray) obj;

        Object[][] data = new Object[userList.size()][5];

        for (int i = 0; i < userList.size(); i++) {
            JSONObject user = (JSONObject) userList.get(i);
            data[i][0] = user.get("StaffName");
            data[i][1] = user.get("UserName");
            data[i][2] = user.get("Branch");
            data[i][3] = user.get("Department");
            data[i][4] = user.get("Designation");
        }

        return data;
    }

    @DataProvider(name = "CreateStaffData")
    public Object[][] getData1() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("C:\\Users\\Mahmoud\\IdeaProjects\\NDC_UPLIFT\\src\\test\\java\\AddStaff.json");
        Object obj = jsonParser.parse(reader);
        JSONArray userList = (JSONArray) obj;

        Object[][] data = new Object[userList.size()][12];

        for (int i = 0; i < userList.size(); i++) {
            JSONObject user = (JSONObject) userList.get(i);
            data[i][0] = user.get("Usertype");
            data[i][1] = user.get("SearchOperatingCountry");
            data[i][2] = user.get("SearchBranch");
            data[i][3] = user.get("SearchDepartment");
            data[i][4] = user.get("Designation");
            data[i][5] = user.get("SearchRole");
            data[i][6] = user.get("EmployeeName");
            data[i][7] = user.get("EmployeeEmail");
            data[i][8] = user.get("EmployeePhoneNo");
            data[i][9] = user.get("EmployeeSecondaryNo");
            data[i][10] = user.get("UserName");
            data[i][11] = user.get("AgencyCode");

        }

        return data;
    }

    @DataProvider(name = "SearchRegionCity")
    public Object[][] getData2() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("C:\\Users\\Mahmoud\\IdeaProjects\\NDC_UPLIFT\\src\\test\\java\\RegionSearchCity.json");
        Object obj = jsonParser.parse(reader);
        JSONArray userList = (JSONArray) obj;

        Object[][] data = new Object[userList.size()][5];

        for (int i = 0; i < userList.size(); i++) {
            JSONObject user = (JSONObject) userList.get(i);
            data[i][0] = user.get("StateName");
            data[i][1] = user.get("StateCode");
            data[i][2] = user.get("CountryName");
            data[i][3] = user.get("CityName");
            data[i][4] = user.get("CityCode");


        }

        return data;
    }

    @DataProvider(name = "AddRegionCity")
    public Object[][] getData3() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("C:\\Users\\Mahmoud\\IdeaProjects\\NDC_UPLIFT\\src\\test\\java\\RegionCreateCity.json");
        Object obj = jsonParser.parse(reader);
        JSONArray userList = (JSONArray) obj;

        Object[][] data = new Object[userList.size()][5];

        for (int i = 0; i < userList.size(); i++) {
            JSONObject user = (JSONObject) userList.get(i);
            data[i][0] = user.get("CountryName");
            data[i][1] = user.get("StateName");
            data[i][2] = user.get("StateCode");
            data[i][3] = user.get("CityName");
            data[i][4] = user.get("CityCode");


        }

        return data;
    }
}

