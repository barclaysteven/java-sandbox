package local.barclays.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class SimpleGet2 {

  private ObjectMapper mapper = new ObjectMapper();
  public static void main(String[] args) throws Exception {
    SimpleGet2 http = new SimpleGet2();

    System.out.println("testing - Sending Get Request");
    http.sendGet();
  }

  private void sendGet() throws Exception {
    String CORRETTO_8_DEB_FORMAT = "java-1.8.0-amazon-corretto-jdk_%s.%s.%s-%s_amd64.deb";
    String CORRETTO_8_RPM_FORMAT = "java-1.8.0-amazon-corretto-devel-1.8.0_%s.b%s-%s.x86_64.rpm";
    String url = "https://api.github.com/repos/corretto/corretto-8/releases/latest";

    HttpClient client = HttpClientBuilder.create().build();

    HttpGet getRequest = new HttpGet(url);

    HttpResponse response = client.execute(getRequest);

    GitHubResponse gitResponse = mapper.readValue(response.getEntity().getContent(), GitHubResponse.class);


  }
}

