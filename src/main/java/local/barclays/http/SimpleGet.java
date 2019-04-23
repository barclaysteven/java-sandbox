package local.barclays.http;


import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class SimpleGet {
  private final String USER_AGENT = "barclays-test";
  private final String CORRETTO_8_DEB_FORMAT = "java-1.8.0-amazon-corretto-jdk_%s.%s.%s-%s_amd64.deb";
  private final String CORRETTO_8_RPM_FORMAT = "java-1.8.0-amazon-corretto-devel-1.8.0_%s.b%s-%s.x86_64.rpm";

  public static void main(String[] args) throws Exception {
    SimpleGet http = new SimpleGet();

    System.out.println("Testing 1 - Send Get Request");
    http.sendGet();
  }

  private void sendGet() throws Exception {
    String url = "https://api.github.com/repos/corretto/corretto-8/releases/latest";

    URL obj = new URL(url);
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

    con.setRequestMethod("GET");
    con.setRequestProperty("User-Agent", USER_AGENT);

    int responseCode = con.getResponseCode();

    System.out.println("\nSending 'Get' request to URL : " + url);
    System.out.println("Response Code : " + responseCode);

    BufferedReader in = new BufferedReader(
        new InputStreamReader(con.getInputStream()));
    String inputLine;
    StringBuffer response = new StringBuffer();

    while ((inputLine = in.readLine()) != null) {
      response.append(inputLine);
    }
    in.close();

    JSONObject jsonObject = new JSONObject(response.toString());
    String version = jsonObject.get("name").toString();
    String[] arrOfString = version.split("\\.");

    System.out.println(String.format(CORRETTO_8_DEB_FORMAT, arrOfString[0], arrOfString[1], arrOfString[2], arrOfString[3]));
    System.out.println(String.format(CORRETTO_8_RPM_FORMAT, arrOfString[1], arrOfString[2], arrOfString[3]));
  }
}
