import org.testng.annotations.DataProvider;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class JsonDataProvider {

    @DataProvider(name = "LoginData")
    public Object[][] getData() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader("C:\\Users\\Mahmoud\\IdeaProjects\\DemoShaft\\src\\test\\java\\Data.json");
        Object obj = jsonParser.parse(reader);
        JSONArray userList = (JSONArray) obj;

        Object[][] data = new Object[userList.size()][2];

        for (int i = 0; i < userList.size(); i++) {
            JSONObject user = (JSONObject) userList.get(i);
            data[i][0] = user.get("username");
            data[i][1] = user.get("password");

        }

        return data;
    }
}
