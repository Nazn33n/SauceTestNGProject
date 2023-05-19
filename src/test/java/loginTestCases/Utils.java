package loginTestCases;

import com.google.gson.JsonObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//public class Utils {
//    public static void main(String[] args) throws IOException, ParseException {
//       Utils.getUsers(1);
//    }
//    public static void getUsers(int pos) throws IOException, ParseException {
//        String fileName = "./src/test/resources/users.json";
//        JSONParser jsonParser = new JSONParser();
//        Object obj = jsonParser.parse(new FileReader(fileName));
//        JSONArray jsonArray = (JSONArray) obj;
//        System.out.println(jsonArray);
//        JSONObject jsonObject = (JSONObject) jsonArray.get(pos);
//        String email = (String) jsonObject.get("email");
//        String password = (String) jsonObject.get("password");
//        System.out.println(email);
//        System.out.println(password);
//
//        JSONParser jsonParser1 = new JSONParser();
//        Object obj1 =jsonParser1.parse(new FileReader(fileName));

        //try in a different way
        public class Utils {

            private String email;
            private String password;

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

      /*      public static void main(String[] args) throws IOException, ParseException {
                Utils utils = new Utils();
                utils.getUsers(0);
                System.out.println(utils.getEmail());
                System.out.println(utils.getPassword());
            }*/
            public void getUsers(int pos) throws IOException, ParseException {
                String fileName = "./src/test/resources/users.json";
                JSONParser jsonParser = new JSONParser();
                Object obj = jsonParser.parse(new FileReader(fileName));
                JSONArray jsonArray = (JSONArray) obj;
                System.out.println(jsonArray);
                JSONObject jsonObject = (JSONObject) jsonArray.get(pos);

                setEmail((String) jsonObject.get("email"));
                setPassword((String) jsonObject.get("password"));

                System.out.println(email);
                System.out.println(password);


    }
}
