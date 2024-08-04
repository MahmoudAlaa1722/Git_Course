import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class JsonDataReader {
    private String Username;
    private String Password;
    private String OperatingCountryName;
    private String SelectCountry;
    private String SelectCurrency;



    public JsonDataReader(String jsonFilePath) {
        try {
            Gson gson = new Gson();
            JsonDataReader data = gson.fromJson(new FileReader(jsonFilePath), JsonDataReader.class);

            this.Username = data.Username;
            this.Password = data.Password;
            this.OperatingCountryName = data.OperatingCountryName;
            this.SelectCountry = data.SelectCountry;
            this.SelectCurrency = data.SelectCurrency;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() { return Password;
    }

    public String getOperatingCountryName(){
        return OperatingCountryName;
    }

    public String getSelectCountry() {
        return SelectCountry;
    }

    public String getSelectCurrency() {
        return SelectCurrency;
    }
}


