// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.OutgoingCallerId;
import com.twilio.type.PhoneNumber;

public class Example {
  /// Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    ResourceSet<OutgoingCallerId> callerIds = OutgoingCallerId.reader()
        .setPhoneNumber(new PhoneNumber("+14158675310"))
        .read();

    // Loop over callerIds and print out a property for each one.
    for (OutgoingCallerId callerId : callerIds) {
      System.out.println(callerId.getPhoneNumber());
    }
  }
}
