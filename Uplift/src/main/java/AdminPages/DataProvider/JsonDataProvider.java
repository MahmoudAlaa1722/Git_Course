package AdminPages.DataProvider;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.DataProvider;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class JsonDataProvider {

    @DataProvider(name = "SearchStaffData")
    public Object[][] SearchStaffData() throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("C:\\Users\\Mahmoud\\Downloads\\Uplift\\src\\test\\java\\AdminPages\\Admin\\Staff\\SearchStaff.json");

        Type listType = new TypeToken<List<Map<String, String>>>() {}.getType();
        List<Map<String, String>> data = gson.fromJson(reader, listType);
        reader.close();

        Object[][] dataArray = new Object[data.size()][1];
        for (int i = 0; i < data.size(); i++) {
            dataArray[i][0] = data.get(i);
        }

        return dataArray;
    }

    @DataProvider(name = "CreateStaffData")
    public Object[][] CreateStaffData() throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("C:\\Users\\Mahmoud\\Downloads\\Uplift\\src\\test\\java\\AdminPages\\Admin\\Staff\\CreateStaff.json");

        Type listType = new TypeToken<List<Map<String, String>>>() {}.getType();
        List<Map<String, String>> data = gson.fromJson(reader, listType);
        reader.close();

        Object[][] dataArray = new Object[data.size()][1];
        for (int i = 0; i < data.size(); i++) {
            dataArray[i][0] = data.get(i);
        }

        return dataArray;
    }

    @DataProvider(name = "SearchRegionCity")
    public Object[][] SearchRegionCity() throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("C:\\Users\\Mahmoud\\Downloads\\Uplift\\src" +
                "\\test\\java\\AdminPages\\Master\\Miscellaneous\\Region\\City\\SearchCity.json");

        Type listType = new TypeToken<List<Map<String, String>>>() {}.getType();
        List<Map<String, String>> data = gson.fromJson(reader, listType);
        reader.close();

        Object[][] dataArray = new Object[data.size()][1];
        for (int i = 0; i < data.size(); i++) {
            dataArray[i][0] = data.get(i);
        }

        return dataArray;
    }

    @DataProvider(name = "AddRegionCity")
    public Object[][] AddRegionCity() throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("C:\\Users\\Mahmoud\\Downloads\\Uplift\\src" +
                "\\test\\java\\AdminPages\\Master\\Miscellaneous\\Region\\City\\CreateCity.json");

        Type listType = new TypeToken<List<Map<String, String>>>() {}.getType();
        List<Map<String, String>> data = gson.fromJson(reader, listType);
        reader.close();

        Object[][] dataArray = new Object[data.size()][1];
        for (int i = 0; i < data.size(); i++) {
            dataArray[i][0] = data.get(i);
        }

        return dataArray;
    }

    @DataProvider(name = "OpCountrySearch")
    public Object[][] OpCountrySearch() throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("C:\\Users\\Mahmoud\\Downloads\\Uplift\\src\\test" +
                "\\java\\AdminPages\\Admin\\Company\\OperatingCountry\\SearchCountry.json");

        Type listType = new TypeToken<List<Map<String, String>>>() {}.getType();
        List<Map<String, String>> data = gson.fromJson(reader, listType);
        reader.close();

        Object[][] dataArray = new Object[data.size()][1];
        for (int i = 0; i < data.size(); i++) {
            dataArray[i][0] = data.get(i);
        }

        return dataArray;
    }

    @DataProvider(name = "AddopCountry")
    public Object[][] AddopCountry() throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("C:\\Users\\Mahmoud\\Downloads\\Uplift\\src\\test\\java" +
                "\\AdminPages\\Admin\\Company\\OperatingCountry\\CreateCountry.json");

        Type listType = new TypeToken<List<Map<String, String>>>() {}.getType();
        List<Map<String, String>> data = gson.fromJson(reader, listType);
        reader.close();

        Object[][] dataArray = new Object[data.size()][1];
        for (int i = 0; i < data.size(); i++) {
            dataArray[i][0] = data.get(i);
        }

        return dataArray;
    }

    @DataProvider(name = "AddDepartment")
    public Object[][] getAddDepartmentData() throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("C:\\Users\\Mahmoud\\Downloads\\Uplift\\src\\test\\java\\AdminPages" +
                "\\Admin\\Company\\Department\\CreateDepartment.json");

        Type listType = new TypeToken<List<Map<String, String>>>() {}.getType();
        List<Map<String, String>> data = gson.fromJson(reader, listType);
        reader.close();

        Object[][] dataArray = new Object[data.size()][1];
        for (int i = 0; i < data.size(); i++) {
            dataArray[i][0] = data.get(i);
        }

        return dataArray;
    }

    @DataProvider(name = "Registraton_requestdata")
    public Object[][] getRegistrationrequestsData() throws IOException {
        Gson gson = new Gson();
        FileReader reader = new FileReader("C:\\Users\\Mahmoud\\Downloads\\Uplift\\src\\test\\java\\AdminPages" +
                "\\Admin\\Agency\\AgencyRegistrationRequest\\RegistrationRequest.json");

        Type listType = new TypeToken<List<Map<String, String>>>() {}.getType();
        List<Map<String, String>> data = gson.fromJson(reader, listType);
        reader.close();

        Object[][] dataArray = new Object[data.size()][1];
        for (int i = 0; i < data.size(); i++) {
            dataArray[i][0] = data.get(i);
        }

        return dataArray;
    }

}

