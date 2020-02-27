package local.barclays.http;

import org.xbill.DNS.CNAMERecord;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.Record;
import org.xbill.DNS.TextParseException;

import java.net.UnknownHostException;

public class DnsLookUp {

  public static void main(String[] args) throws UnknownHostException {
    String domain = "dev.cfg.dtm.development-fh5.fslocal.org";

    try {
      Lookup lookup = new Lookup(domain, 5);
      Record[] results = lookup.run();

      if (lookup.getAnswers() == null || lookup.getAnswers().length == 0) {
        System.out.println("no record");
        System.out.println("Lookup result: " + lookup.getResult());
        System.out.println("Lookup error: " + lookup.getErrorString());
      }

      System.out.println("Lookup result: " + lookup.getResult());
      for (Record record : results){
        System.out.println("Lookup answer: " + record.toString());
      }
      System.out.println("Lookup error: " + lookup.getErrorString());
    }
    catch (TextParseException e) {
      System.out.println("An error occurred while attempting to resolve domain target:" + domain + " error: " + e);
    }
  }
}

