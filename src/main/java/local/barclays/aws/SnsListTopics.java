package local.barclays.aws;




import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.SnsClientBuilder;
import software.amazon.awssdk.services.sns.model.ListTopicsResponse;
import software.amazon.awssdk.services.sns.model.Topic;

public class SnsListTopics {
  public static void main(String[] args) {
//    ProfileCredentialsProvider creds = new ProfileCredentialsProvider("playground-fh2");
//    AmazonSNS sns = AmazonSNSClientBuilder.standard().withRegion("us-east-1").withCredentials(creds).build();
//
//    ListTopicsResult results = sns.listTopics();
//
//    for (Topic topicArn : results.getTopics()) {
//      if ( topicArn.getTopicArn().contains("barclays")){
//        System.out.println("Topics: " + topicArn.getTopicArn());
//      }
//    }

//    SnsClient sns =  SnsClient.builder()
//                     .region(Region.US_EAST_1)
//                     .credentialsProvider(ProfileCredentialsProvider.builder()
//                         .profileName("playground-fh2")
//                         .build())
//                     .build();
//
//    ListTopicsResponse topics = sns.listTopics();
//
//    for (Topic topic : topics.topics()) {
//      System.out.println("Topic Arns: " + topic.topicArn());
//    }



//    AmazonGuardDuty guardDuty = AmazonGuardDutyClientBuilder.standard().withCredentials(new ProfileCredentialsProvider("playground-fh2")).build();
//
//    ListDetectorsRequest request = new ListDetectorsRequest();
//    ListDetectorsResult result = guardDuty.listDetectors(request);
//
//    for (String detectorId : result.getDetectorIds()) {
//      System.out.println("DetectorIds: " + detectorId);
//    }
  }
}
