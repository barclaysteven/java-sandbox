package local.barclays.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GitHubResponse {
  private static final ObjectMapper MAPPER = new ObjectMapper();

  private String name;
}
